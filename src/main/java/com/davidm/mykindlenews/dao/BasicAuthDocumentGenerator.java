package com.davidm.mykindlenews.dao;

import com.davidm.mykindlenews.interfaces.AuthDocumentGenerator;

public class BasicAuthDocumentGenerator implements AuthDocumentGenerator {

	@Override
	public String generate(String key) {
		return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">"
				+ "<html lang=\"en\">"
				+ "<head>"
				+ "<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">"
				+ "<title>Welcome to KindleNews</title>"
				+ "</head>"
				+ "<body style=\"text-align:center\">"
				+ "<h1>Welcome to KindleNews</h1>"
				+ "<p>Below is the registration code to activate your account</p>"
				+ "<h1>" + key + "</h1>" + "</body>" + "</html>";

	}

}
