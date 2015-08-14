package com.davidm.mykindlenews.interfaces;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public interface MysqlConfiguration {
	public String getDriverClass();
	public String getJDBCUrl();
	public String getUser();
	public String getPassword();
	public int getMinPoolSize();
	public int getAquireIncrement();
	public int getMaxPoolSize();
	public int getMaxStatements();

	
	public default ComboPooledDataSource configure(ComboPooledDataSource dataSource) throws PropertyVetoException{
		dataSource.setDriverClass(getDriverClass());
		dataSource.setJdbcUrl(getJDBCUrl());
		dataSource.setUser(getUser());
		dataSource.setPassword(getPassword());
		dataSource.setMinPoolSize(getMinPoolSize());
		dataSource.setAcquireIncrement(getAquireIncrement());
		dataSource.setMaxPoolSize(getMaxPoolSize());
		dataSource.setMaxStatements(getMaxStatements());
		dataSource.setMaxIdleTime(60*60);
		return dataSource;
	}

}
