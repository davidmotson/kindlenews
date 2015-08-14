package com.davidm.mykindlenews;

import static spark.Spark.*;

import org.apache.log4j.Logger;

import spark.Spark;
import spark.TemplateEngine;

import com.davidm.mykindlenews.controllers.BaseController;
import com.davidm.mykindlenews.controllers.UsersController;
import com.davidm.mykindlenews.interfaces.SparkConfig;
import com.davidm.mykindlenews.interfaces.WebServer;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MyKindleNewsServer implements WebServer {
	
	public static class SparkException extends RuntimeException{
		private static final long serialVersionUID = 4786854759660875932L;
		public SparkException(String e) {
			super(e);
		}
	}
	
	private final SparkConfig config;
	private final UsersController usersController;
	private final BaseController baseController;
	private final TemplateEngine engine;
	private final Logger logger;
	
	@Inject
	public MyKindleNewsServer(SparkConfig config,
			UsersController usersController, BaseController baseController,
			TemplateEngine engine, Logger logger) {
		this.config = config;
		this.usersController = usersController;
		this.baseController = baseController;
		this.engine = engine;
		this.logger = logger;
	}
	
	@Override
	public void init() {
		configure();
		route();
		logger.info("Server Started");
	}
	
	public void configure(){
		staticFileLocation(config.getPublicDir());
		port(config.getPort());
		exception(SparkException.class, config.getExceptionHandler());
	}
	
	public void route(){
		post("/users/create", usersController::createUser);
		post("/users/create_key", usersController::createKey);
		post("/users/check_key", usersController::checkKey);
		post("/users/login", usersController::login);
		post("/users/sub", usersController::sub);
		get("/account", usersController::account, engine);
		get("/signup", usersController::signup, engine);
		get("/logout", usersController::logout);
		get("/activate", usersController::activate, engine);
		get("/", baseController::home, engine);
	}

	@Override
	public void stop() {
		Spark.stop();
	}
}
