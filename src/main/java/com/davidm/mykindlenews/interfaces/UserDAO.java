package com.davidm.mykindlenews.interfaces;

import com.davidm.mykindlenews.generated.jooq.mykindlenews.tables.records.UsersRecord;

public interface UserDAO {
	public Integer createUser(String username, String password, String kindleEmail);
	public int checkLogin(String username, String password);
	public UsersRecord getUser(int userId);
	public void activateUser(Integer userId);
}
