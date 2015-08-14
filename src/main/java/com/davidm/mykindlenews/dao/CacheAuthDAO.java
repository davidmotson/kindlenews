package com.davidm.mykindlenews.dao;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Hex;

import com.davidm.mykindlenews.interfaces.AuthDAO;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CacheAuthDAO implements AuthDAO {
	private final Cache<String, Integer> authCache;
	
	@Inject
	public CacheAuthDAO() {
		authCache = CacheBuilder.newBuilder()
				.expireAfterWrite(7, TimeUnit.DAYS).build();
	}

	@Override
	public String addAuth(int userId) {
		byte[] bytes = new byte[32];
		new SecureRandom().nextBytes(bytes);
		String key = new String(Hex.encodeHex(bytes));
		authCache.put(key, userId);
		return key;
	}

	@Override
	public Integer checkAuth(String authKey) {
		return authCache.getIfPresent(authKey);
	}
	
	@Override
	public void invalidate(String key){
		authCache.invalidate(key);
	}

}
