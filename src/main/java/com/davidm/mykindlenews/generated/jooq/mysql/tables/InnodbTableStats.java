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
public class InnodbTableStats extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord> {

	private static final long serialVersionUID = 540975526;

	/**
	 * The reference instance of <code>mysql.innodb_table_stats</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats INNODB_TABLE_STATS = new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord.class;
	}

	/**
	 * The column <code>mysql.innodb_table_stats.database_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, java.lang.String> DATABASE_NAME = createField("database_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.table_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.last_update</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.n_rows</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, org.jooq.types.ULong> N_ROWS = createField("n_rows", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.clustered_index_size</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, org.jooq.types.ULong> CLUSTERED_INDEX_SIZE = createField("clustered_index_size", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.sum_of_other_index_sizes</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord, org.jooq.types.ULong> SUM_OF_OTHER_INDEX_SIZES = createField("sum_of_other_index_sizes", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>mysql.innodb_table_stats</code> table reference
	 */
	public InnodbTableStats() {
		this("innodb_table_stats", null);
	}

	/**
	 * Create an aliased <code>mysql.innodb_table_stats</code> table reference
	 */
	public InnodbTableStats(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats.INNODB_TABLE_STATS);
	}

	private InnodbTableStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbTableStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_INNODB_TABLE_STATS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbTableStatsRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_INNODB_TABLE_STATS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbTableStats(name, null);
	}
}
