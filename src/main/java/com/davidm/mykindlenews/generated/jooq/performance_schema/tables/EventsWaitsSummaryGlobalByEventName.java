/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.performance_schema.tables;

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
public class EventsWaitsSummaryGlobalByEventName extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord> {

	private static final long serialVersionUID = -1999425553;

	/**
	 * The reference instance of <code>performance_schema.events_waits_summary_global_by_event_name</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryGlobalByEventName() {
		this("events_waits_summary_global_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_summary_global_by_event_name</code> table reference
	 */
	public EventsWaitsSummaryGlobalByEventName(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME);
	}

	private EventsWaitsSummaryGlobalByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsSummaryGlobalByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsWaitsSummaryGlobalByEventNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsWaitsSummaryGlobalByEventName(name, null);
	}
}