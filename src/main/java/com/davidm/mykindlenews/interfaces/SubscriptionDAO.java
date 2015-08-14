package com.davidm.mykindlenews.interfaces;

import java.util.List;

import com.davidm.mykindlenews.domain.MailTask;
import com.davidm.mykindlenews.domain.NewsSource;

public interface SubscriptionDAO {
	public List<NewsSource> getAllNewsSources(int userId);
	public List<String> getRecipesForToday();
	public List<MailTask> getMailTasksForToday();
	public void subscribe(int userId, int newsSourceId);
	public void unsubscribe(int userId, int newsSourceId);
}
