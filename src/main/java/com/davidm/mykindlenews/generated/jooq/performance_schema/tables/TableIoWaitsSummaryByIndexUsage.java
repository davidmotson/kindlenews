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
public class TableIoWaitsSummaryByIndexUsage extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord> {

	private static final long serialVersionUID = -1055171786;

	/**
	 * The reference instance of <code>performance_schema.table_io_waits_summary_by_index_usage</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord.class;
	}

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, java.lang.String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, java.lang.String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, java.lang.String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_READ = createField("SUM_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_READ = createField("MIN_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_READ = createField("AVG_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_READ = createField("MAX_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_WRITE = createField("SUM_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_WRITE = createField("MIN_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_WRITE = createField("AVG_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_WRITE = createField("MAX_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_FETCH = createField("COUNT_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_FETCH = createField("SUM_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_FETCH = createField("MIN_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_FETCH = createField("AVG_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_FETCH = createField("MAX_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_INSERT = createField("COUNT_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_INSERT = createField("SUM_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_INSERT = createField("MIN_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_INSERT = createField("AVG_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_INSERT = createField("MAX_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_UPDATE = createField("COUNT_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_UPDATE = createField("SUM_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_UPDATE = createField("MIN_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_UPDATE = createField("AVG_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_UPDATE = createField("MAX_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> COUNT_DELETE = createField("COUNT_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> SUM_TIMER_DELETE = createField("SUM_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MIN_TIMER_DELETE = createField("MIN_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> AVG_TIMER_DELETE = createField("AVG_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord, org.jooq.types.ULong> MAX_TIMER_DELETE = createField("MAX_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.table_io_waits_summary_by_index_usage</code> table reference
	 */
	public TableIoWaitsSummaryByIndexUsage() {
		this("table_io_waits_summary_by_index_usage", null);
	}

	/**
	 * Create an aliased <code>performance_schema.table_io_waits_summary_by_index_usage</code> table reference
	 */
	public TableIoWaitsSummaryByIndexUsage(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
	}

	private TableIoWaitsSummaryByIndexUsage(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord> aliased) {
		this(alias, aliased, null);
	}

	private TableIoWaitsSummaryByIndexUsage(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage(name, null);
	}
}
