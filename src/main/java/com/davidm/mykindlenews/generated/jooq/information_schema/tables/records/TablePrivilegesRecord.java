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
public class TablePrivilegesRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TablePrivilegesRecord> implements org.jooq.Record6<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1348824353;

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.GRANTEE</code>.
	 */
	public void setGrantee(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.GRANTEE</code>.
	 */
	public java.lang.String getGrantee() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public void setPrivilegeType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public java.lang.String getPrivilegeType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public void setIsGrantable(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public java.lang.String getIsGrantable() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.GRANTEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.PRIVILEGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES.IS_GRANTABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getGrantee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPrivilegeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getIsGrantable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value1(java.lang.String value) {
		setGrantee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value2(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value3(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value4(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value5(java.lang.String value) {
		setPrivilegeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord value6(java.lang.String value) {
		setIsGrantable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablePrivilegesRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TablePrivilegesRecord
	 */
	public TablePrivilegesRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES);
	}

	/**
	 * Create a detached, initialised TablePrivilegesRecord
	 */
	public TablePrivilegesRecord(java.lang.String grantee, java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.String privilegeType, java.lang.String isGrantable) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES);

		setValue(0, grantee);
		setValue(1, tableCatalog);
		setValue(2, tableSchema);
		setValue(3, tableName);
		setValue(4, privilegeType);
		setValue(5, isGrantable);
	}
}
