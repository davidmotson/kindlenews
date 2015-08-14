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
public class InnodbMetrics extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord> {

	private static final long serialVersionUID = -1814315405;

	/**
	 * The reference instance of <code>information_schema.INNODB_METRICS</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics INNODB_METRICS = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_METRICS.NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.String> SUBSYSTEM = createField("SUBSYSTEM", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COUNT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> COUNT = createField("COUNT", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> MAX_COUNT = createField("MAX_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> MIN_COUNT = createField("MIN_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Double> AVG_COUNT = createField("AVG_COUNT", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> COUNT_RESET = createField("COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> MAX_COUNT_RESET = createField("MAX_COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> MIN_COUNT_RESET = createField("MIN_COUNT_RESET", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Double> AVG_COUNT_RESET = createField("AVG_COUNT_RESET", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.sql.Timestamp> TIME_ENABLED = createField("TIME_ENABLED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.sql.Timestamp> TIME_DISABLED = createField("TIME_DISABLED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.Long> TIME_ELAPSED = createField("TIME_ELAPSED", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.sql.Timestamp> TIME_RESET = createField("TIME_RESET", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.STATUS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_METRICS.COMMENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord, java.lang.String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_METRICS</code> table reference
	 */
	public InnodbMetrics() {
		this("INNODB_METRICS", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_METRICS</code> table reference
	 */
	public InnodbMetrics(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS);
	}

	private InnodbMetrics(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbMetrics(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics(name, null);
	}
}
