package com.davidm.mykindlenews.config;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.davidm.mykindlenews.interfaces.CalibreConfiguration;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MyCalibreConfig implements CalibreConfiguration {
	private final File rootOutputDir = new File("/home/ubuntu/output");
	private final File recipeDir = new File("/home/ubuntu/recipes");
	private final DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
	
	@Inject
	public MyCalibreConfig() {
		rootOutputDir.mkdirs();
		recipeDir.mkdirs();
	}
	

	@Override
	public File getOutputFile(String recipe, Date date) {
		return new File(new File(rootOutputDir, dateFormat.format(date)), convertRecipeToMobi(recipe));
	}

	@Override
	public File getRecipeDir() {
		return recipeDir;
	}
	
	private static String convertRecipeToMobi(String recipe){
		String[] split = recipe.split("\\.");
		split[split.length-1] = "mobi";
		return StringUtils.join(split, ".");
	}
}
