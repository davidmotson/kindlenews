/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsStatementsSummaryByAccountByEventNameRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByAccountByEventNameRecord> {

	private static final long serialVersionUID = -1846521523;

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.USER</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.USER</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.HOST</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.HOST</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.COUNT_STAR</code>.
	 */
	public org.jooq.types.ULong getCountStar() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getSumTimerWait() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMinTimerWait() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWait() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWait() {
		return (org.jooq.types.ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_LOCK_TIME</code>.
	 */
	public void setSumLockTime(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_LOCK_TIME</code>.
	 */
	public org.jooq.types.ULong getSumLockTime() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ERRORS</code>.
	 */
	public void setSumErrors(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ERRORS</code>.
	 */
	public org.jooq.types.ULong getSumErrors() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_WARNINGS</code>.
	 */
	public void setSumWarnings(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_WARNINGS</code>.
	 */
	public org.jooq.types.ULong getSumWarnings() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_AFFECTED</code>.
	 */
	public void setSumRowsAffected(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_AFFECTED</code>.
	 */
	public org.jooq.types.ULong getSumRowsAffected() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_SENT</code>.
	 */
	public void setSumRowsSent(org.jooq.types.ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_SENT</code>.
	 */
	public org.jooq.types.ULong getSumRowsSent() {
		return (org.jooq.types.ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_EXAMINED</code>.
	 */
	public void setSumRowsExamined(org.jooq.types.ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_ROWS_EXAMINED</code>.
	 */
	public org.jooq.types.ULong getSumRowsExamined() {
		return (org.jooq.types.ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public void setSumCreatedTmpDiskTables(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public org.jooq.types.ULong getSumCreatedTmpDiskTables() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_TABLES</code>.
	 */
	public void setSumCreatedTmpTables(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_CREATED_TMP_TABLES</code>.
	 */
	public org.jooq.types.ULong getSumCreatedTmpTables() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_JOIN</code>.
	 */
	public void setSumSelectFullJoin(org.jooq.types.ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_JOIN</code>.
	 */
	public org.jooq.types.ULong getSumSelectFullJoin() {
		return (org.jooq.types.ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public void setSumSelectFullRangeJoin(org.jooq.types.ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public org.jooq.types.ULong getSumSelectFullRangeJoin() {
		return (org.jooq.types.ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE</code>.
	 */
	public void setSumSelectRange(org.jooq.types.ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE</code>.
	 */
	public org.jooq.types.ULong getSumSelectRange() {
		return (org.jooq.types.ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public void setSumSelectRangeCheck(org.jooq.types.ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public org.jooq.types.ULong getSumSelectRangeCheck() {
		return (org.jooq.types.ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_SCAN</code>.
	 */
	public void setSumSelectScan(org.jooq.types.ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SELECT_SCAN</code>.
	 */
	public org.jooq.types.ULong getSumSelectScan() {
		return (org.jooq.types.ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_MERGE_PASSES</code>.
	 */
	public void setSumSortMergePasses(org.jooq.types.ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_MERGE_PASSES</code>.
	 */
	public org.jooq.types.ULong getSumSortMergePasses() {
		return (org.jooq.types.ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_RANGE</code>.
	 */
	public void setSumSortRange(org.jooq.types.ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_RANGE</code>.
	 */
	public org.jooq.types.ULong getSumSortRange() {
		return (org.jooq.types.ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_ROWS</code>.
	 */
	public void setSumSortRows(org.jooq.types.ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_ROWS</code>.
	 */
	public org.jooq.types.ULong getSumSortRows() {
		return (org.jooq.types.ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_SCAN</code>.
	 */
	public void setSumSortScan(org.jooq.types.ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_SORT_SCAN</code>.
	 */
	public org.jooq.types.ULong getSumSortScan() {
		return (org.jooq.types.ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_INDEX_USED</code>.
	 */
	public void setSumNoIndexUsed(org.jooq.types.ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_INDEX_USED</code>.
	 */
	public org.jooq.types.ULong getSumNoIndexUsed() {
		return (org.jooq.types.ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public void setSumNoGoodIndexUsed(org.jooq.types.ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.events_statements_summary_by_account_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public org.jooq.types.ULong getSumNoGoodIndexUsed() {
		return (org.jooq.types.ULong) getValue(26);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsStatementsSummaryByAccountByEventNameRecord
	 */
	public EventsStatementsSummaryByAccountByEventNameRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsStatementsSummaryByAccountByEventNameRecord
	 */
	public EventsStatementsSummaryByAccountByEventNameRecord(java.lang.String user, java.lang.String host, java.lang.String eventName, org.jooq.types.ULong countStar, org.jooq.types.ULong sumTimerWait, org.jooq.types.ULong minTimerWait, org.jooq.types.ULong avgTimerWait, org.jooq.types.ULong maxTimerWait, org.jooq.types.ULong sumLockTime, org.jooq.types.ULong sumErrors, org.jooq.types.ULong sumWarnings, org.jooq.types.ULong sumRowsAffected, org.jooq.types.ULong sumRowsSent, org.jooq.types.ULong sumRowsExamined, org.jooq.types.ULong sumCreatedTmpDiskTables, org.jooq.types.ULong sumCreatedTmpTables, org.jooq.types.ULong sumSelectFullJoin, org.jooq.types.ULong sumSelectFullRangeJoin, org.jooq.types.ULong sumSelectRange, org.jooq.types.ULong sumSelectRangeCheck, org.jooq.types.ULong sumSelectScan, org.jooq.types.ULong sumSortMergePasses, org.jooq.types.ULong sumSortRange, org.jooq.types.ULong sumSortRows, org.jooq.types.ULong sumSortScan, org.jooq.types.ULong sumNoIndexUsed, org.jooq.types.ULong sumNoGoodIndexUsed) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);

		setValue(0, user);
		setValue(1, host);
		setValue(2, eventName);
		setValue(3, countStar);
		setValue(4, sumTimerWait);
		setValue(5, minTimerWait);
		setValue(6, avgTimerWait);
		setValue(7, maxTimerWait);
		setValue(8, sumLockTime);
		setValue(9, sumErrors);
		setValue(10, sumWarnings);
		setValue(11, sumRowsAffected);
		setValue(12, sumRowsSent);
		setValue(13, sumRowsExamined);
		setValue(14, sumCreatedTmpDiskTables);
		setValue(15, sumCreatedTmpTables);
		setValue(16, sumSelectFullJoin);
		setValue(17, sumSelectFullRangeJoin);
		setValue(18, sumSelectRange);
		setValue(19, sumSelectRangeCheck);
		setValue(20, sumSelectScan);
		setValue(21, sumSortMergePasses);
		setValue(22, sumSortRange);
		setValue(23, sumSortRows);
		setValue(24, sumSortScan);
		setValue(25, sumNoIndexUsed);
		setValue(26, sumNoGoodIndexUsed);
	}
}