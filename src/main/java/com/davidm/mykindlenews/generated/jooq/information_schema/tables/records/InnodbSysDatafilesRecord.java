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
public class InnodbSysDatafilesRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbSysDatafilesRecord> implements org.jooq.Record2<org.jooq.types.UInteger, java.lang.String> {

	private static final long serialVersionUID = 1262731315;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
	 */
	public void setSpace(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
	 */
	public org.jooq.types.UInteger getSpace() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
	 */
	public void setPath(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
	 */
	public java.lang.String getPath() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysDatafilesRecord value1(org.jooq.types.UInteger value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysDatafilesRecord value2(java.lang.String value) {
		setPath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysDatafilesRecord values(org.jooq.types.UInteger value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysDatafilesRecord
	 */
	public InnodbSysDatafilesRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES);
	}

	/**
	 * Create a detached, initialised InnodbSysDatafilesRecord
	 */
	public InnodbSysDatafilesRecord(org.jooq.types.UInteger space, java.lang.String path) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES);

		setValue(0, space);
		setValue(1, path);
	}
}
