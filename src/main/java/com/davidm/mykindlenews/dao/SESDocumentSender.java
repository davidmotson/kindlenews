package com.davidm.mykindlenews.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.RawMessage;
import com.amazonaws.services.simpleemail.model.SendRawEmailRequest;
import com.davidm.mykindlenews.domain.MailAttachment;
import com.davidm.mykindlenews.interfaces.DocumentMailer;
import com.davidm.mykindlenews.interfaces.SESMailConfiguration;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class SESDocumentSender implements DocumentMailer {
	private final AmazonSimpleEmailServiceClient client;
	private final SESMailConfiguration config;
	private final Logger logger;

	@Inject
	public SESDocumentSender(AmazonSimpleEmailServiceClient client,
			SESMailConfiguration config, Logger logger) {
		this.client = client;
		this.config = config;
		this.logger = logger;
	}

	@Override
	public boolean sendDocuments(String toAddress,
			MailAttachment... attachments) {
		try {
			Session session = Session.getInstance(new Properties());
			MimeMessage mimeMessage = new MimeMessage(session);
			mimeMessage.setSubject("Document Delivery");
			MimeMultipart mimeMultipart = new MimeMultipart();
			BodyPart htmlBody = new MimeBodyPart();
			htmlBody.setContent("<p>Your Documents are Enclosed</p>",
					"text/html");
			mimeMultipart.addBodyPart(htmlBody);
			for (MailAttachment attachment : attachments) {
				MimeBodyPart mimeBodyPart = new MimeBodyPart();
				mimeBodyPart.setFileName(attachment.getFileName());
				mimeBodyPart.setDataHandler(new DataHandler(attachment
						.getDataSource()));
				mimeMultipart.addBodyPart(mimeBodyPart);
			}
			mimeMessage.setContent(mimeMultipart);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			mimeMessage.writeTo(outputStream);
			RawMessage rawMessage = new RawMessage(ByteBuffer.wrap(outputStream
					.toByteArray()));
			SendRawEmailRequest request = new SendRawEmailRequest(rawMessage)
					.withDestinations(toAddress).withSource(
							config.getFromEmail());
			client.sendRawEmail(request);
			return true;
		} catch (MessagingException | IOException e) {
			logger.error("Error sending email to " + toAddress, e);
			return false;
		}
	}

}
