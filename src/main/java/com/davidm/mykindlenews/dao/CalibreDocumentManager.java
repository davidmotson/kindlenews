package com.davidm.mykindlenews.dao;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.davidm.mykindlenews.domain.MailAttachment;
import com.davidm.mykindlenews.interfaces.CalibreConfiguration;
import com.davidm.mykindlenews.interfaces.DocumentManager;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CalibreDocumentManager implements DocumentManager {
	
	private final Logger logger;
	private final CalibreConfiguration calibreConfig;
	
	
	@Inject
	public CalibreDocumentManager(Logger logger, CalibreConfiguration calibreConfig){
		this.logger = logger;
		this.calibreConfig = calibreConfig;
		
	}
	
	

	@Override
	public boolean createDocument(String recipe) {
		File recipeFile = new File(calibreConfig.getRecipeDir(), recipe);
		if(!recipeFile.exists()){
			logger.error("Recipe file does not exist: " + recipeFile.getAbsolutePath());
			return false;
		}
		String recipePath = recipeFile.getAbsolutePath();
		File outputFile = calibreConfig.getOutputFile(recipe, new Date());
		outputFile.getParentFile().mkdirs();
		String outputPath = outputFile.getAbsolutePath();
		try {
			Process process = new ProcessBuilder("ebook-convert", recipePath,
					outputPath, "--output-profile", "kindle").redirectOutput(
					new File(outputPath + ".txt")).start();
			int returnCode = process.waitFor();
			if(returnCode != 0){
				logger.error("Error while generating " + outputPath);
				return false;
			}
			return true;
		} catch (IOException | InterruptedException e) {
			logger.error("Error while generating " + recipe , e);
			return false;
		}
	}

	@Override
	public MailAttachment getDocument(String recipe, Date date) {
		File document = calibreConfig.getOutputFile(recipe, date);
		if(document.exists()){
			return MailAttachment.of(document);
		}
		logger.error("File: " + document.getAbsolutePath() + " does not exist");
		return null;
	}

}
