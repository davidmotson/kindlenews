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
public class InnodbIndexStats extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> {

	private static final long serialVersionUID = -1743710767;

	/**
	 * The reference instance of <code>mysql.innodb_index_stats</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats INNODB_INDEX_STATS = new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord.class;
	}

	/**
	 * The column <code>mysql.innodb_index_stats.database_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.lang.String> DATABASE_NAME = createField("database_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.table_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.index_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.last_update</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.stat_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.lang.String> STAT_NAME = createField("stat_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.stat_value</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, org.jooq.types.ULong> STAT_VALUE = createField("stat_value", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.sample_size</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, org.jooq.types.ULong> SAMPLE_SIZE = createField("sample_size", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>mysql.innodb_index_stats.stat_description</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord, java.lang.String> STAT_DESCRIPTION = createField("stat_description", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * Create a <code>mysql.innodb_index_stats</code> table reference
	 */
	public InnodbIndexStats() {
		this("innodb_index_stats", null);
	}

	/**
	 * Create an aliased <code>mysql.innodb_index_stats</code> table reference
	 */
	public InnodbIndexStats(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS);
	}

	private InnodbIndexStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbIndexStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_INNODB_INDEX_STATS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_INNODB_INDEX_STATS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats(name, null);
	}
}
