package com.davidm.mykindlenews;

import java.io.IOException;

import com.davidm.mykindlenews.config.MyKindleNewsModule;
import com.davidm.mykindlenews.interfaces.DocumentService;
import com.davidm.mykindlenews.interfaces.WebServer;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	public static void main(String[] args) throws SecurityException, IOException {
		Injector injector = Guice.createInjector(new MyKindleNewsModule());
		WebServer server = injector.getInstance(WebServer.class);
		DocumentService service = injector.getInstance(DocumentService.class);
		server.init();
		service.init();
	}
}
