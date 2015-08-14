/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.information_schema.tables.records;

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
public class InnodbMetricsRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbMetricsRecord> implements org.jooq.Record17<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -425693196;

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
	 */
	public void setSubsystem(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
	 */
	public java.lang.String getSubsystem() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.COUNT</code>.
	 */
	public void setCount(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.COUNT</code>.
	 */
	public java.lang.Long getCount() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
	 */
	public void setMaxCount(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
	 */
	public java.lang.Long getMaxCount() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
	 */
	public void setMinCount(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
	 */
	public java.lang.Long getMinCount() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
	 */
	public void setAvgCount(java.lang.Double value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
	 */
	public java.lang.Double getAvgCount() {
		return (java.lang.Double) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
	 */
	public void setCountReset(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
	 */
	public java.lang.Long getCountReset() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
	 */
	public void setMaxCountReset(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
	 */
	public java.lang.Long getMaxCountReset() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
	 */
	public void setMinCountReset(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
	 */
	public java.lang.Long getMinCountReset() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
	 */
	public void setAvgCountReset(java.lang.Double value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
	 */
	public java.lang.Double getAvgCountReset() {
		return (java.lang.Double) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
	 */
	public void setTimeEnabled(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
	 */
	public java.sql.Timestamp getTimeEnabled() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
	 */
	public void setTimeDisabled(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
	 */
	public java.sql.Timestamp getTimeDisabled() {
		return (java.sql.Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
	 */
	public void setTimeElapsed(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
	 */
	public java.lang.Long getTimeElapsed() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
	 */
	public void setTimeReset(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
	 */
	public java.sql.Timestamp getTimeReset() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.STATUS</code>.
	 */
	public void setStatus(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.STATUS</code>.
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.TYPE</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.TYPE</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_METRICS.COMMENT</code>.
	 */
	public void setComment(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_METRICS.COMMENT</code>.
	 */
	public java.lang.String getComment() {
		return (java.lang.String) getValue(16);
	}

	// -------------------------------------------------------------------------
	// Record17 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row17) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row17<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row17) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.SUBSYSTEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.MAX_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.MIN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field6() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.AVG_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.COUNT_RESET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.MAX_COUNT_RESET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.MIN_COUNT_RESET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field10() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.AVG_COUNT_RESET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.TIME_ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.TIME_DISABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.TIME_ELAPSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.TIME_RESET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSubsystem();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getMaxCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getMinCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value6() {
		return getAvgCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getCountReset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getMaxCountReset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getMinCountReset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value10() {
		return getAvgCountReset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getTimeEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getTimeDisabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getTimeElapsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getTimeReset();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value2(java.lang.String value) {
		setSubsystem(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value3(java.lang.Long value) {
		setCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value4(java.lang.Long value) {
		setMaxCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value5(java.lang.Long value) {
		setMinCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value6(java.lang.Double value) {
		setAvgCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value7(java.lang.Long value) {
		setCountReset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value8(java.lang.Long value) {
		setMaxCountReset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value9(java.lang.Long value) {
		setMinCountReset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value10(java.lang.Double value) {
		setAvgCountReset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value11(java.sql.Timestamp value) {
		setTimeEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value12(java.sql.Timestamp value) {
		setTimeDisabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value13(java.lang.Long value) {
		setTimeElapsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value14(java.sql.Timestamp value) {
		setTimeReset(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value15(java.lang.String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value16(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord value17(java.lang.String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbMetricsRecord values(java.lang.String value1, java.lang.String value2, java.lang.Long value3, java.lang.Long value4, java.lang.Long value5, java.lang.Double value6, java.lang.Long value7, java.lang.Long value8, java.lang.Long value9, java.lang.Double value10, java.sql.Timestamp value11, java.sql.Timestamp value12, java.lang.Long value13, java.sql.Timestamp value14, java.lang.String value15, java.lang.String value16, java.lang.String value17) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbMetricsRecord
	 */
	public InnodbMetricsRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS);
	}

	/**
	 * Create a detached, initialised InnodbMetricsRecord
	 */
	public InnodbMetricsRecord(java.lang.String name, java.lang.String subsystem, java.lang.Long count, java.lang.Long maxCount, java.lang.Long minCount, java.lang.Double avgCount, java.lang.Long countReset, java.lang.Long maxCountReset, java.lang.Long minCountReset, java.lang.Double avgCountReset, java.sql.Timestamp timeEnabled, java.sql.Timestamp timeDisabled, java.lang.Long timeElapsed, java.sql.Timestamp timeReset, java.lang.String status, java.lang.String type, java.lang.String comment) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbMetrics.INNODB_METRICS);

		setValue(0, name);
		setValue(1, subsystem);
		setValue(2, count);
		setValue(3, maxCount);
		setValue(4, minCount);
		setValue(5, avgCount);
		setValue(6, countReset);
		setValue(7, maxCountReset);
		setValue(8, minCountReset);
		setValue(9, avgCountReset);
		setValue(10, timeEnabled);
		setValue(11, timeDisabled);
		setValue(12, timeElapsed);
		setValue(13, timeReset);
		setValue(14, status);
		setValue(15, type);
		setValue(16, comment);
	}
}
