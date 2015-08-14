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
public class EventsWaitsSummaryByAccountByEventNameRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryByAccountByEventNameRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> {

	private static final long serialVersionUID = 1076569378;

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.USER</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.USER</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.HOST</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.HOST</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.COUNT_STAR</code>.
	 */
	public void setCountStar(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.COUNT_STAR</code>.
	 */
	public org.jooq.types.ULong getCountStar() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getSumTimerWait() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMinTimerWait() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWait() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.events_waits_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.events_waits_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWait() {
		return (org.jooq.types.ULong) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.ULong> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.COUNT_STAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field5() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.SUM_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field6() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MIN_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field7() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.AVG_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field8() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME.MAX_TIMER_WAIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getCountStar();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value5() {
		return getSumTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value6() {
		return getMinTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value7() {
		return getAvgTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value8() {
		return getMaxTimerWait();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value1(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value2(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value3(java.lang.String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value4(org.jooq.types.ULong value) {
		setCountStar(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value5(org.jooq.types.ULong value) {
		setSumTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value6(org.jooq.types.ULong value) {
		setMinTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value7(org.jooq.types.ULong value) {
		setAvgTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord value8(org.jooq.types.ULong value) {
		setMaxTimerWait(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsSummaryByAccountByEventNameRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, org.jooq.types.ULong value4, org.jooq.types.ULong value5, org.jooq.types.ULong value6, org.jooq.types.ULong value7, org.jooq.types.ULong value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventsWaitsSummaryByAccountByEventNameRecord
	 */
	public EventsWaitsSummaryByAccountByEventNameRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised EventsWaitsSummaryByAccountByEventNameRecord
	 */
	public EventsWaitsSummaryByAccountByEventNameRecord(java.lang.String user, java.lang.String host, java.lang.String eventName, org.jooq.types.ULong countStar, org.jooq.types.ULong sumTimerWait, org.jooq.types.ULong minTimerWait, org.jooq.types.ULong avgTimerWait, org.jooq.types.ULong maxTimerWait) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);

		setValue(0, user);
		setValue(1, host);
		setValue(2, eventName);
		setValue(3, countStar);
		setValue(4, sumTimerWait);
		setValue(5, minTimerWait);
		setValue(6, avgTimerWait);
		setValue(7, maxTimerWait);
	}
}
