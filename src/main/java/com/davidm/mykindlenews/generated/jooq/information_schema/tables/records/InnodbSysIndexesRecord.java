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
public class InnodbSysIndexesRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbSysIndexesRecord> implements org.jooq.Record7<org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -602590874;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
	 */
	public void setIndexId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
	 */
	public org.jooq.types.ULong getIndexId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
	 */
	public void setTableId(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
	 */
	public org.jooq.types.ULong getTableId() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
	 */
	public void setType(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
	 */
	public java.lang.Integer getType() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
	 */
	public void setNFields(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
	 */
	public java.lang.Integer getNFields() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
	 */
	public void setPageNo(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
	 */
	public java.lang.Integer getPageNo() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
	 */
	public void setSpace(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
	 */
	public java.lang.Integer getSpace() {
		return (java.lang.Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<org.jooq.types.ULong, java.lang.String, org.jooq.types.ULong, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.INDEX_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.TABLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.N_FIELDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.PAGE_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value1() {
		return getIndexId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value3() {
		return getTableId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getNFields();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPageNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value1(org.jooq.types.ULong value) {
		setIndexId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value3(org.jooq.types.ULong value) {
		setTableId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value4(java.lang.Integer value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value5(java.lang.Integer value) {
		setNFields(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value6(java.lang.Integer value) {
		setPageNo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord value7(java.lang.Integer value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysIndexesRecord values(org.jooq.types.ULong value1, java.lang.String value2, org.jooq.types.ULong value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.Integer value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysIndexesRecord
	 */
	public InnodbSysIndexesRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES);
	}

	/**
	 * Create a detached, initialised InnodbSysIndexesRecord
	 */
	public InnodbSysIndexesRecord(org.jooq.types.ULong indexId, java.lang.String name, org.jooq.types.ULong tableId, java.lang.Integer type, java.lang.Integer nFields, java.lang.Integer pageNo, java.lang.Integer space) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES);

		setValue(0, indexId);
		setValue(1, name);
		setValue(2, tableId);
		setValue(3, type);
		setValue(4, nFields);
		setValue(5, pageNo);
		setValue(6, space);
	}
}
