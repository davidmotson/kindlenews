package com.davidm.mykindlenews.dao;

import static com.davidm.mykindlenews.generated.jooq.mykindlenews.Tables.USERS;

import java.sql.Timestamp;
import java.util.Optional;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.davidm.mykindlenews.MyKindleNewsServer.SparkException;

import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;

import com.davidm.mykindlenews.generated.jooq.mykindlenews.tables.records.UsersRecord;
import com.davidm.mykindlenews.helpers.PasswordHash;
import com.davidm.mykindlenews.interfaces.UserDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MysqlUserDAO implements UserDAO {
	
	private final DSLContext dsl;

	@Inject
	public MysqlUserDAO(DSLContext dsl) {
		this.dsl = dsl;
	}

	@Override
	public Integer createUser(String username, String password, String kindleEmail) {
		verifyKindleEmail(kindleEmail);
		try {
			UsersRecord newUser = dsl
					.insertInto(USERS, USERS.USERNAME, USERS.PASSWORD,
							USERS.KINDLE_EMAIL, USERS.CREATED_AT, USERS.ACTIVE)
					.values(username, PasswordHash.createHash(password),
							kindleEmail,
							new Timestamp(System.currentTimeMillis()), false)
					.returning(USERS.ID).fetchOne();
			if (newUser == null) {
				return null;
			}
			return newUser.getId();
		} catch (DataAccessException e) {
			throw new SparkException("Duplicate kindle email or username");
		}
	}

	private void verifyKindleEmail(String kindleEmail) {
		try {
			InternetAddress address = new InternetAddress(kindleEmail);
			address.validate();
		} catch (AddressException e) {
			throw new SparkException("Invalid Email");
		}
		if(!kindleEmail.endsWith("@kindle.com")){
			throw new SparkException("Kindle Email must end with @kindle.com");
		}
	}

	@Override
	public int checkLogin(String username, String password) {
		UsersRecord user = dsl.selectFrom(USERS).where(USERS.USERNAME.eq(username)).fetchOne();
		return Optional
				.ofNullable(user)
				.filter(x -> PasswordHash.validatePassword(password,
						x.getPassword())).map(UsersRecord::getId)
				.orElseGet(() -> {throw new SparkException("Invalid Login");});

	}

	@Override
	public UsersRecord getUser(int userId) {
		return dsl.selectFrom(USERS).where(USERS.ID.eq(userId)).fetchOne();
	}

	@Override
	public void activateUser(Integer userId) {
		dsl.update(USERS).set(USERS.ACTIVE, true).where(USERS.ID.eq(userId)).execute();
	}

}
