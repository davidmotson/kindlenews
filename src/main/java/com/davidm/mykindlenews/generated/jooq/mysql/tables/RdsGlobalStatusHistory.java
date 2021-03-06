/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

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
public class RdsGlobalStatusHistory extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord> {

	private static final long serialVersionUID = -423231266;

	/**
	 * The reference instance of <code>mysql.rds_global_status_history</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory RDS_GLOBAL_STATUS_HISTORY = new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord.class;
	}

	/**
	 * The column <code>mysql.rds_global_status_history.collection_end</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord, java.sql.Timestamp> COLLECTION_END = createField("collection_end", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.rds_global_status_history.collection_start</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord, java.sql.Timestamp> COLLECTION_START = createField("collection_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>mysql.rds_global_status_history.variable_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord, java.lang.String> VARIABLE_NAME = createField("variable_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.rds_global_status_history.variable_value</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord, java.lang.String> VARIABLE_VALUE = createField("variable_value", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>mysql.rds_global_status_history.variable_delta</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord, java.lang.Integer> VARIABLE_DELTA = createField("variable_delta", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>mysql.rds_global_status_history</code> table reference
	 */
	public RdsGlobalStatusHistory() {
		this("rds_global_status_history", null);
	}

	/**
	 * Create an aliased <code>mysql.rds_global_status_history</code> table reference
	 */
	public RdsGlobalStatusHistory(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory.RDS_GLOBAL_STATUS_HISTORY);
	}

	private RdsGlobalStatusHistory(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private RdsGlobalStatusHistory(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_RDS_GLOBAL_STATUS_HISTORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsGlobalStatusHistoryRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_RDS_GLOBAL_STATUS_HISTORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsGlobalStatusHistory(name, null);
	}
}
