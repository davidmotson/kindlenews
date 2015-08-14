/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.information_schema.tables;

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
public class Statistics extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord> {

	private static final long serialVersionUID = -1557368737;

	/**
	 * The reference instance of <code>information_schema.STATISTICS</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics STATISTICS = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord.class;
	}

	/**
	 * The column <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.NON_UNIQUE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.Long> NON_UNIQUE = createField("NON_UNIQUE", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> INDEX_SCHEMA = createField("INDEX_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.INDEX_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.Long> SEQ_IN_INDEX = createField("SEQ_IN_INDEX", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.COLLATION</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> COLLATION = createField("COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(1), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.CARDINALITY</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.Long> CARDINALITY = createField("CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.STATISTICS.SUB_PART</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.Long> SUB_PART = createField("SUB_PART", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.STATISTICS.PACKED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> PACKED = createField("PACKED", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.NULLABLE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.INDEX_TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> INDEX_TYPE = createField("INDEX_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.COMMENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

	/**
	 * The column <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord, java.lang.String> INDEX_COMMENT = createField("INDEX_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.STATISTICS</code> table reference
	 */
	public Statistics() {
		this("STATISTICS", null);
	}

	/**
	 * Create an aliased <code>information_schema.STATISTICS</code> table reference
	 */
	public Statistics(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics.STATISTICS);
	}

	private Statistics(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Statistics(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.StatisticsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.Statistics(name, null);
	}
}
