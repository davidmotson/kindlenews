package com.davidm.mykindlenews.helpers;

import java.util.stream.Stream;

import com.davidm.mykindlenews.MyKindleNewsServer.SparkException;

import spark.Request;

public class RouteUtils {
	
	public static String[] checkFormParams(Request request, String... params){
		return Stream.of(params).map(param -> {
			String value = request.queryMap(param).value();
			if(value == null || value.isEmpty()){
				throw new SparkException("Missing " + param);
			}
			return value;
		}).toArray(x -> new String[x]);
	}
}
