package com.davidm.mykindlenews.interfaces;

public interface EmailConfirmationDAO {
	public void sendEmailConfirmation(int userId, String userEmail);
	public Integer checkEmailConfirmation(String key);

}
