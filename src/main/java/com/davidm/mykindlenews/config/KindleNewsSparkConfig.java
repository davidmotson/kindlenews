package com.davidm.mykindlenews.config;

import org.jooq.tools.json.JSONObject;

import spark.ExceptionHandler;
import spark.Request;
import spark.Response;

import com.davidm.mykindlenews.interfaces.SparkConfig;
import com.google.common.collect.ImmutableMap;

public class KindleNewsSparkConfig implements SparkConfig {

	@Override
	public int getPort() {
		return 8080;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		return new KindleNewsExceptionHandler();
	}
	
	private static class KindleNewsExceptionHandler implements ExceptionHandler{

		@Override
		public void handle(Exception exception, Request request, Response response) {
			response.body(JSONObject.toJSONString(ImmutableMap.of("status",
					"error", "error", exception.getMessage())));
		}
		
	}

	@Override
	public String getPublicDir() {
		return "/public";
	}



}
