package com.davidm.mykindlenews.interfaces;

import java.io.File;
import java.util.Date;

public interface CalibreConfiguration {
	public File getOutputFile(String recipe, Date date);
	public File getRecipeDir();
}
