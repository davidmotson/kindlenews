package com.davidm.mykindlenews.interfaces;

public interface AuthDAO {
	public String addAuth(int userId);
	public Integer checkAuth(String authKey);
	void invalidate(String key);
}
