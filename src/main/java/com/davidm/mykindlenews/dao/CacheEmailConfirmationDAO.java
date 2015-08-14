package com.davidm.mykindlenews.dao;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

import javax.mail.util.ByteArrayDataSource;

import com.davidm.mykindlenews.domain.MailAttachment;
import com.davidm.mykindlenews.interfaces.AuthDocumentGenerator;
import com.davidm.mykindlenews.interfaces.DocumentMailer;
import com.davidm.mykindlenews.interfaces.EmailConfirmationDAO;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CacheEmailConfirmationDAO implements EmailConfirmationDAO {
	private final Cache<Integer, Integer> cache;
	private final DocumentMailer mailer;
	private final AuthDocumentGenerator generator;
	@Inject
	public CacheEmailConfirmationDAO(DocumentMailer mailer, AuthDocumentGenerator generator) {
		this.mailer = mailer;
		this.generator = generator;
		cache = CacheBuilder.newBuilder().expireAfterWrite(1, TimeUnit.DAYS)
				.build();
	}

	@Override
	public void sendEmailConfirmation(int userId, String email) {
		int random = new SecureRandom().nextInt(9000) + 1000;
		String document = generator.generate(Integer.toString(random));
		cache.put(random, userId);
		mailer.sendDocuments(
				email,
				new MailAttachment("Welcome to KindleNews.html",
						new ByteArrayDataSource(document
								.getBytes(StandardCharsets.UTF_8), "text/html")));
	}

	@Override
	public Integer checkEmailConfirmation(String key) {
		try {
			return cache.getIfPresent(Integer.parseInt(key));
		} catch (NumberFormatException e) {
			return null;
		}
	}

}
