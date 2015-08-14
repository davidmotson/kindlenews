package com.davidm.mykindlenews.controllers;

import java.util.Collections;
import java.util.Optional;

import com.davidm.mykindlenews.interfaces.AuthDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

@Singleton
public class BaseController {
	private final AuthDAO authDao;

	@Inject
	public BaseController(AuthDAO authDAO) {
		this.authDao = authDAO;
	}

	public ModelAndView home(Request request, Response response) {
		Optional.ofNullable(request.cookie("auth"))
				.map(x -> authDao.checkAuth(x))
				.ifPresent(x -> response.redirect("/account"));
		return new ModelAndView(Collections.emptyMap(), "templates/home.wm");
	}

}
