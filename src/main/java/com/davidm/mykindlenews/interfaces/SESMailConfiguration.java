package com.davidm.mykindlenews.interfaces;

import com.amazonaws.regions.Region;

public interface SESMailConfiguration {
	public String getAccessKey();
	public String getSecretKey();
	public String getFromEmail();
	public Region getRegion();
}
