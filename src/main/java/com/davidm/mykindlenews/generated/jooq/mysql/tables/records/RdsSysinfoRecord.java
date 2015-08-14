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
public class RdsSysinfoRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 332252532;

	/**
	 * Setter for <code>mysql.rds_sysinfo.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.rds_sysinfo.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.rds_sysinfo.value</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.rds_sysinfo.value</code>.
	 */
	public java.lang.String getValue() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo.RDS_SYSINFO.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo.RDS_SYSINFO.VALUE;
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
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsSysinfoRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsSysinfoRecord value2(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsSysinfoRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RdsSysinfoRecord
	 */
	public RdsSysinfoRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo.RDS_SYSINFO);
	}

	/**
	 * Create a detached, initialised RdsSysinfoRecord
	 */
	public RdsSysinfoRecord(java.lang.String name, java.lang.String value) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo.RDS_SYSINFO);

		setValue(0, name);
		setValue(1, value);
	}
}
