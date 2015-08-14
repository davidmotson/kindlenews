package com.davidm.mykindlenews;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import com.davidm.mykindlenews.domain.MailAttachment;
import com.davidm.mykindlenews.interfaces.DocumentManager;
import com.davidm.mykindlenews.interfaces.DocumentService;
import com.davidm.mykindlenews.interfaces.SubscriptionDAO;
import com.davidm.mykindlenews.interfaces.DocumentMailer;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class CalibreDocumentService implements DocumentService{
	private final Logger logger;
	private final SubscriptionDAO subDao;
	private final DocumentManager docManager;
	private final DocumentMailer docMailer;
	private final Timer timer;
	
	@Inject
	public CalibreDocumentService(Logger logger, SubscriptionDAO subDao,
			DocumentManager docManager, DocumentMailer docMailer) {
		this.logger = logger;
		this.subDao = subDao;
		this.docMailer = docMailer;
		this.docManager = docManager;
		timer = new Timer("CalibreDocumentService");
	}

	@Override
	public void init() {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);
		if(today.get(Calendar.HOUR_OF_DAY) >= 12){
			today.add(Calendar.DAY_OF_MONTH, 1);
		}
		today.set(Calendar.HOUR_OF_DAY, 12);
		logger.info("CalibreDocumentService scheduled for: " + new SimpleDateFormat().format(today.getTime()));
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				CalibreDocumentService.this.task();
			}
		}, today.getTime(), 1000 * 60 * 60 * 24);
	}

	@Override
	public void stop() {
		timer.cancel();
	}
	
	private void task(){
		logger.info("Beginning CalibreDocumentService");
		subDao.getRecipesForToday().forEach(docManager::createDocument);
		logger.info("CalibreDocumentService finished downloading news");
		subDao.getMailTasksForToday().forEach(mailTask -> {
			try {
				MailAttachment document = docManager.getDocument(
						mailTask.getRecipe(), new Date());
				if (document == null) {
					logger.error("Could not mail " + mailTask);
					return;
				}
				docMailer.sendDocuments(mailTask.getEmail(), document);
			} catch (Exception e) {
				logger.error("Error while pricessing " + mailTask, e);
			}
		});
		logger.info("Finished CalibreDocumentService");
	}

}
