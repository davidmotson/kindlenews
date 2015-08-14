package com.davidm.mykindlenews.controllers;

import static com.davidm.mykindlenews.helpers.RouteUtils.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import com.davidm.mykindlenews.MyKindleNewsServer.SparkException;
import com.davidm.mykindlenews.generated.jooq.mykindlenews.tables.records.UsersRecord;
import com.davidm.mykindlenews.interfaces.AuthDAO;
import com.davidm.mykindlenews.interfaces.EmailConfirmationDAO;
import com.davidm.mykindlenews.interfaces.SubscriptionDAO;
import com.davidm.mykindlenews.interfaces.UserDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class UsersController {

	private final UserDAO userDao;
	private final AuthDAO authDao;
	private final SubscriptionDAO subDao;
	private final EmailConfirmationDAO confirmationDao;

	@Inject
	public UsersController(UserDAO userDao, AuthDAO authDao,
			EmailConfirmationDAO confirmationDao, SubscriptionDAO subDao) {
		this.userDao = userDao;
		this.authDao = authDao;
		this.subDao = subDao;
		this.confirmationDao = confirmationDao;

	}

	public UsersRecord getUser(Request request) {
		return Optional.ofNullable(request.cookie("auth")).map(authDao::checkAuth)
				.map(userDao::getUser).orElse(null);
	}

	public String createUser(Request request, Response response) {
		String[] params = checkFormParams(request, "username", "password",
				"kindle_email");
		Integer newId = userDao.createUser(params[0], params[1], params[2]);
		response.cookie("/", "auth", authDao.addAuth(newId), 60 * 60 * 24 * 7,
				false);
		return "{\"status\":\"success\"}";

	}

	public String login(Request request, Response response) {
		String[] params = checkFormParams(request, "username", "password");
		int userId = userDao.checkLogin(params[0], params[1]);
		JSONObject output = new JSONObject();
		output.put("status", "success");
		response.cookie("/", "auth", authDao.addAuth(userId), 60 * 60 * 24 * 7,
				false);
		return output.toString();
	}

	public ModelAndView account(Request request, Response response) {
		UsersRecord user = getUser(request);
		Map<String, Object> data = new HashMap<>();
		if (user == null) {
			response.redirect("/");
		}else if(!user.getActive()){
			response.redirect("/activate");
		} else {
			data.put("username", user.getUsername());
			data.put("news", subDao.getAllNewsSources(user.getId()));
		}
		return new ModelAndView(data, "templates/account.wm");
	}
	
	public ModelAndView signup(Request request, Response response) {
		UsersRecord user = getUser(request);
		if (user != null) {
			if(user.getActive()){
				response.redirect("/account");
			}else{
				response.redirect("/activate");
			}
		} 
		return new ModelAndView(Collections.emptyMap(), "templates/signup.wm");
	}
	
	public ModelAndView activate(Request request, Response response) {
		UsersRecord user = getUser(request);
		if (user == null) {
			response.redirect("/signup");
		}else if(user.getActive()){
			response.redirect("/account");
		}
		return new ModelAndView(Collections.emptyMap(), "templates/activate.wm");
	}

	public String logout(Request request, Response response) {
		authDao.invalidate(request.cookie("auth"));
		response.cookie("/", "auth", "", 0, false);
		response.redirect("/");
		return "success";
	}

	public String createKey(Request request, Response response) {
		UsersRecord user = getUser(request);
		if (user == null) {
			throw new SparkException("not logged in");
		}
		confirmationDao.sendEmailConfirmation(user.getId(), user.getKindleEmail());
		return "{\"status\":\"success\"}";

	}

	public String checkKey(Request request, Response response) {
		UsersRecord user = getUser(request);
		if (user == null) {
			throw new SparkException("Not Logged In");
		}
		String[] key = checkFormParams(request, "key");
		Integer userId = confirmationDao.checkEmailConfirmation(key[0]);
		if(userId == null || !userId.equals(user.getId())){
			throw new SparkException("Incorrect Key");
		}
		userDao.activateUser(userId);
		return "{\"status\":\"success\"}";
	}
	
	public String sub(Request request, Response response) {
		UsersRecord user = getUser(request);
		if (user == null) {
			throw new SparkException("Not Logged In");
		}
		String[] params = checkFormParams(request, "id", "checked");
		if(Boolean.parseBoolean(params[1])){
			subDao.subscribe(user.getId(), Integer.parseInt(params[0]));
		}else{
			subDao.unsubscribe(user.getId(), Integer.parseInt(params[0]));
		}
		return "{\"status\":\"success\"}";
	}

}
