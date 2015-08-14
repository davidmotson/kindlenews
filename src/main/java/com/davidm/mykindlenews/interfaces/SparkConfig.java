package com.davidm.mykindlenews.interfaces;

import spark.ExceptionHandler;

public interface SparkConfig {
	public int getPort();

	public ExceptionHandler getExceptionHandler();

	public String getPublicDir();
}
