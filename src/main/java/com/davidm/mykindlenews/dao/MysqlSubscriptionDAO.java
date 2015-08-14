package com.davidm.mykindlenews.dao;

import static com.davidm.mykindlenews.generated.jooq.mykindlenews.Tables.*;
import static org.jooq.impl.DSL.*;

import java.util.Calendar;
import java.util.List;

import org.jooq.DSLContext;

import com.davidm.mykindlenews.domain.MailTask;
import com.davidm.mykindlenews.domain.NewsSource;
import com.davidm.mykindlenews.interfaces.SubscriptionDAO;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MysqlSubscriptionDAO implements SubscriptionDAO {
	private final DSLContext dsl;
	
	@Inject
	public MysqlSubscriptionDAO(DSLContext dsl) {
		this.dsl = dsl;
	}

	@Override
	public List<NewsSource> getAllNewsSources(int userId) {
		return dsl
				.select(count(SUBSCRIPTIONS.NEWS_SOURCE_ID), NEWS_SOURCES.ID,
						NEWS_SOURCES.NAME, NEWS_SOURCES.RECIPE_FILE,
						NEWS_SOURCES.DESCRIPTION, NEWS_SOURCES.LANGUAGE,
						NEWS_SOURCES.CONTENT_DAYS, NEWS_SOURCES.CATEGORY_1)
				.from(NEWS_SOURCES.leftOuterJoin(SUBSCRIPTIONS).on(
						NEWS_SOURCES.ID.eq(SUBSCRIPTIONS.NEWS_SOURCE_ID).and(
								SUBSCRIPTIONS.USER_ID.eq(userId))))
				.groupBy(NEWS_SOURCES.ID).fetch()
				.map(record -> {
					return new NewsSource(record.getValue(NEWS_SOURCES.ID),
							record.getValue(NEWS_SOURCES.NAME), record
									.getValue(NEWS_SOURCES.RECIPE_FILE), record
									.getValue(NEWS_SOURCES.CATEGORY_1), record
									.getValue(NEWS_SOURCES.LANGUAGE), record
									.getValue(NEWS_SOURCES.DESCRIPTION), record
									.getValue(NEWS_SOURCES.CONTENT_DAYS),
							record.getValue(0, Integer.class) != 0);
				});
	}

	@Override
	public void subscribe(int userId, int newsSourceId) {
		dsl.insertInto(SUBSCRIPTIONS, SUBSCRIPTIONS.NEWS_SOURCE_ID,
				SUBSCRIPTIONS.USER_ID).values(newsSourceId, userId)
				.onDuplicateKeyIgnore().execute();

	}

	@Override
	public void unsubscribe(int userId, int newsSourceId) {
		dsl.delete(SUBSCRIPTIONS)
				.where(SUBSCRIPTIONS.USER_ID.eq(userId).and(
						SUBSCRIPTIONS.NEWS_SOURCE_ID.eq(newsSourceId)))
				.execute();
	}
	private final String[] daysOfWeek = {"Su","Mo","Tu","We","Th","Fr","Sa"};
	
	private String getDayAsRegex(){
		return "%" + daysOfWeek[(Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7] + "%";
	}
	
	@Override
	public List<String> getRecipesForToday() {
		String dayOfWeek = getDayAsRegex();
		return dsl.select(NEWS_SOURCES.RECIPE_FILE).from(NEWS_SOURCES)
				.where(NEWS_SOURCES.CONTENT_DAYS.like(dayOfWeek)).fetch()
				.map(x -> x.getValue(0, String.class));
	}

	@Override
	public List<MailTask> getMailTasksForToday() {
		String dayOfWeek = getDayAsRegex();
		return dsl
				.select(NEWS_SOURCES.RECIPE_FILE, USERS.KINDLE_EMAIL)
				.from(NEWS_SOURCES.join(SUBSCRIPTIONS)
						.on(SUBSCRIPTIONS.NEWS_SOURCE_ID.eq(NEWS_SOURCES.ID))
						.join(USERS).on(SUBSCRIPTIONS.USER_ID.eq(USERS.ID)))
				.where(NEWS_SOURCES.CONTENT_DAYS.like(dayOfWeek)).fetch()
				.map(x -> new MailTask(x.getValue(USERS.KINDLE_EMAIL,
						String.class), x.getValue(NEWS_SOURCES.RECIPE_FILE,
						String.class)));
	}
}
