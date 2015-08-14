package com.davidm.mykindlenews.domain;

import lombok.Value;

@Value
public class NewsSource {
	int id;
	String name;
	String recipeFile;
	String category;
	String language;
	String description;
	String contentDays;
	boolean subscribed;
}
