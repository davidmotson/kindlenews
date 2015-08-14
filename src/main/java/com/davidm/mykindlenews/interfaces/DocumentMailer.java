package com.davidm.mykindlenews.interfaces;

import com.davidm.mykindlenews.domain.MailAttachment;

public interface DocumentMailer {
	public boolean sendDocuments(String toAddress, MailAttachment... attachments);
}
