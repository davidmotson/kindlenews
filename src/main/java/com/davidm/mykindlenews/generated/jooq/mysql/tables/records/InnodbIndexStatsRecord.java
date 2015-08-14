/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables.records;

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
public class InnodbIndexStatsRecord extends org.jooq.impl.UpdatableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.InnodbIndexStatsRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> {

	private static final long serialVersionUID = 42896060;

	/**
	 * Setter for <code>mysql.innodb_index_stats.database_name</code>.
	 */
	public void setDatabaseName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.database_name</code>.
	 */
	public java.lang.String getDatabaseName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.table_name</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.table_name</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.index_name</code>.
	 */
	public void setIndexName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.index_name</code>.
	 */
	public java.lang.String getIndexName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.last_update</code>.
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.last_update</code>.
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.stat_name</code>.
	 */
	public void setStatName(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.stat_name</code>.
	 */
	public java.lang.String getStatName() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.stat_value</code>.
	 */
	public void setStatValue(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.stat_value</code>.
	 */
	public org.jooq.types.ULong getStatValue() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.sample_size</code>.
	 */
	public void setSampleSize(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.sample_size</code>.
	 */
	public org.jooq.types.ULong getSampleSize() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>mysql.innodb_index_stats.stat_description</code>.
	 */
	public void setStatDescription(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.innodb_index_stats.stat_description</code>.
	 */
	public java.lang.String getStatDescription() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.DATABASE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.STAT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field6() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.STAT_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field7() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.SAMPLE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS.STAT_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDatabaseName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getStatName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value6() {
		return getStatValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value7() {
		return getSampleSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getStatDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value1(java.lang.String value) {
		setDatabaseName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value2(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value3(java.lang.String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value4(java.sql.Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value5(java.lang.String value) {
		setStatName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value6(org.jooq.types.ULong value) {
		setStatValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value7(org.jooq.types.ULong value) {
		setSampleSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord value8(java.lang.String value) {
		setStatDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbIndexStatsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.lang.String value5, org.jooq.types.ULong value6, org.jooq.types.ULong value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbIndexStatsRecord
	 */
	public InnodbIndexStatsRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS);
	}

	/**
	 * Create a detached, initialised InnodbIndexStatsRecord
	 */
	public InnodbIndexStatsRecord(java.lang.String databaseName, java.lang.String tableName, java.lang.String indexName, java.sql.Timestamp lastUpdate, java.lang.String statName, org.jooq.types.ULong statValue, org.jooq.types.ULong sampleSize, java.lang.String statDescription) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS);

		setValue(0, databaseName);
		setValue(1, tableName);
		setValue(2, indexName);
		setValue(3, lastUpdate);
		setValue(4, statName);
		setValue(5, statValue);
		setValue(6, sampleSize);
		setValue(7, statDescription);
	}
}