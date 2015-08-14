package com.davidm.mykindlenews.interfaces;

import java.util.Date;
import com.davidm.mykindlenews.domain.MailAttachment;

public interface DocumentManager {
	public boolean createDocument(String recipe);
	public MailAttachment getDocument(String recipe, Date date);
}
