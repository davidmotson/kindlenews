package com.davidm.mykindlenews.domain;

import java.io.File;

import javax.activation.DataSource;
import javax.activation.FileDataSource;

import lombok.Value;

@Value
public class MailAttachment {
	String fileName;
	DataSource dataSource;
	
	public static MailAttachment of(File in){
		return new MailAttachment(in.getName(), new FileDataSource(in));
	}
}
