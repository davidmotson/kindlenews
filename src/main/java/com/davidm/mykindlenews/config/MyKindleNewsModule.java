package com.davidm.mykindlenews.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import spark.TemplateEngine;
import spark.template.velocity.VelocityTemplateEngine;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.davidm.mykindlenews.CalibreDocumentService;
import com.davidm.mykindlenews.MyKindleNewsServer;
import com.davidm.mykindlenews.controllers.BaseController;
import com.davidm.mykindlenews.controllers.UsersController;
import com.davidm.mykindlenews.dao.BasicAuthDocumentGenerator;
import com.davidm.mykindlenews.dao.CacheAuthDAO;
import com.davidm.mykindlenews.dao.CacheEmailConfirmationDAO;
import com.davidm.mykindlenews.dao.CalibreDocumentManager;
import com.davidm.mykindlenews.dao.MysqlSubscriptionDAO;
import com.davidm.mykindlenews.dao.MysqlUserDAO;
import com.davidm.mykindlenews.dao.SESDocumentSender;
import com.davidm.mykindlenews.interfaces.AuthDAO;
import com.davidm.mykindlenews.interfaces.AuthDocumentGenerator;
import com.davidm.mykindlenews.interfaces.CalibreConfiguration;
import com.davidm.mykindlenews.interfaces.DocumentMailer;
import com.davidm.mykindlenews.interfaces.DocumentManager;
import com.davidm.mykindlenews.interfaces.DocumentService;
import com.davidm.mykindlenews.interfaces.EmailConfirmationDAO;
import com.davidm.mykindlenews.interfaces.MysqlConfiguration;
import com.davidm.mykindlenews.interfaces.SESMailConfiguration;
import com.davidm.mykindlenews.interfaces.SparkConfig;
import com.davidm.mykindlenews.interfaces.UserDAO;
import com.davidm.mykindlenews.interfaces.WebServer;
import com.davidm.mykindlenews.interfaces.SubscriptionDAO;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyKindleNewsModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SparkConfig.class).to(KindleNewsSparkConfig.class);
		bind(WebServer.class).to(MyKindleNewsServer.class);
		bind(MysqlConfiguration.class).to(KindleNewsMysqlConfiguration.class);
		bind(UserDAO.class).to(MysqlUserDAO.class);
		bind(UsersController.class);
		bind(BaseController.class);
		bind(TemplateEngine.class).to(VelocityTemplateEngine.class).in(Singleton.class);
		bind(AuthDAO.class).to(CacheAuthDAO.class);
		bind(SESMailConfiguration.class).to(MyKindleNewsMailConfig.class);
		bind(DocumentMailer.class).to(SESDocumentSender.class);
		bind(AuthDocumentGenerator.class).to(BasicAuthDocumentGenerator.class);
		bind(EmailConfirmationDAO.class).to(CacheEmailConfirmationDAO.class);
		bind(SubscriptionDAO.class).to(MysqlSubscriptionDAO.class);
		bind(CalibreConfiguration.class).to(MyCalibreConfig.class);
		bind(DocumentManager.class).to(CalibreDocumentManager.class);
		bind(DocumentService.class).to(CalibreDocumentService.class);
	}
	
	@Provides
	@Singleton
	DSLContext provideMysqlContext(MysqlConfiguration config){
		try {
			DataSource source = config.configure(new ComboPooledDataSource());
			return DSL.using(source, SQLDialect.MYSQL);
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Provides
	@Singleton
	AmazonSimpleEmailServiceClient provideMailClient(SESMailConfiguration config){
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(
				config.getAccessKey(), config.getSecretKey());
		AmazonSimpleEmailServiceClient client = new AmazonSimpleEmailServiceClient(awsCreds);
		client.setRegion(config.getRegion());
		return client;
	}
	
	@Provides
	@Singleton
	Logger provideLogger(){
		Logger logger = Logger.getLogger("MyKindleNews");
		logger.removeAllAppenders();
		FileAppender fa = new FileAppender();
		fa.setName("FileLogger");
		fa.setFile("log.txt");
		fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
		fa.setThreshold(Level.DEBUG);
		fa.setAppend(true);
		fa.activateOptions();
		logger.addAppender(fa);
		return logger;
	}

}
