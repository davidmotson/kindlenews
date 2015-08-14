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
public class EventsStatementsSummaryByHostByEventName extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord> {

	private static final long serialVersionUID = 806681841;

	/**
	 * The reference instance of <code>performance_schema.events_statements_summary_by_host_by_event_name</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.HOST</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, java.lang.String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_LOCK_TIME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_LOCK_TIME = createField("SUM_LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_ERRORS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_ERRORS = createField("SUM_ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_WARNINGS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_WARNINGS = createField("SUM_WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_ROWS_AFFECTED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_ROWS_AFFECTED = createField("SUM_ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_ROWS_SENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_ROWS_SENT = createField("SUM_ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_ROWS_EXAMINED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_ROWS_EXAMINED = createField("SUM_ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_CREATED_TMP_DISK_TABLES = createField("SUM_CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_CREATED_TMP_TABLES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_CREATED_TMP_TABLES = createField("SUM_CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SELECT_FULL_JOIN</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SELECT_FULL_JOIN = createField("SUM_SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SELECT_FULL_RANGE_JOIN = createField("SUM_SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SELECT_RANGE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SELECT_RANGE = createField("SUM_SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SELECT_RANGE_CHECK = createField("SUM_SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SELECT_SCAN</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SELECT_SCAN = createField("SUM_SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SORT_MERGE_PASSES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SORT_MERGE_PASSES = createField("SUM_SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SORT_RANGE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SORT_RANGE = createField("SUM_SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SORT_ROWS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SORT_ROWS = createField("SUM_SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_SORT_SCAN</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_SORT_SCAN = createField("SUM_SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_NO_INDEX_USED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_NO_INDEX_USED = createField("SUM_NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_statements_summary_by_host_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord, org.jooq.types.ULong> SUM_NO_GOOD_INDEX_USED = createField("SUM_NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.events_statements_summary_by_host_by_event_name</code> table reference
	 */
	public EventsStatementsSummaryByHostByEventName() {
		this("events_statements_summary_by_host_by_event_name", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_statements_summary_by_host_by_event_name</code> table reference
	 */
	public EventsStatementsSummaryByHostByEventName(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME);
	}

	private EventsStatementsSummaryByHostByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStatementsSummaryByHostByEventName(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStatementsSummaryByHostByEventNameRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStatementsSummaryByHostByEventName(name, null);
	}
}