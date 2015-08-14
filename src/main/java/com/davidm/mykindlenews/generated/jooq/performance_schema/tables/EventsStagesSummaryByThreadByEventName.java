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
public class EventsStagesSummaryByThreadByEventName extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord> {

	private static final long serialVersionUID = 1626406373;

	/**
	 * The reference instance of <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByThreadByEventName() {
		this("events_stages_summary_by_thread_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
	 */
	public EventsStagesSummaryByThreadByEventName(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
	}

	private EventsStagesSummaryByThreadByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStagesSummaryByThreadByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesSummaryByThreadByEventNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesSummaryByThreadByEventName(name, null);
	}
}