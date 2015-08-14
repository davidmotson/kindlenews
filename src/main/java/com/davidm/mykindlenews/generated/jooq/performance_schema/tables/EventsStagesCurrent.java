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
public class EventsStagesCurrent extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord> {

	private static final long serialVersionUID = 636548154;

	/**
	 * The reference instance of <code>performance_schema.events_stages_current</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent EVENTS_STAGES_CURRENT = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_stages_current.THREAD_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.EVENT_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.END_EVENT_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.EVENT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, java.lang.String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.SOURCE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, java.lang.String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.TIMER_START</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.TIMER_END</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.NESTING_EVENT_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, org.jooq.types.ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_current.NESTING_EVENT_TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.EventsStagesCurrentNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.EventsStagesCurrentNestingEventType.class), this, "");

	/**
	 * Create a <code>performance_schema.events_stages_current</code> table reference
	 */
	public EventsStagesCurrent() {
		this("events_stages_current", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_stages_current</code> table reference
	 */
	public EventsStagesCurrent(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT);
	}

	private EventsStagesCurrent(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStagesCurrent(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.EventsStagesCurrentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.EventsStagesCurrent(name, null);
	}
}