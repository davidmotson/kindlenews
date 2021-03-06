/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables.records;

/**
 * Stored Procedures
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcRecord extends org.jooq.impl.UpdatableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> implements org.jooq.Record20<java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType, byte[], byte[], byte[], java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[]> {

	private static final long serialVersionUID = -768617224;

	/**
	 * Setter for <code>mysql.proc.db</code>.
	 */
	public void setDb(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.proc.db</code>.
	 */
	public java.lang.String getDb() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.proc.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.proc.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.proc.type</code>.
	 */
	public void setType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.proc.type</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType getType() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType) getValue(2);
	}

	/**
	 * Setter for <code>mysql.proc.specific_name</code>.
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.proc.specific_name</code>.
	 */
	public java.lang.String getSpecificName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.proc.language</code>.
	 */
	public void setLanguage(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.proc.language</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage getLanguage() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage) getValue(4);
	}

	/**
	 * Setter for <code>mysql.proc.sql_data_access</code>.
	 */
	public void setSqlDataAccess(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.proc.sql_data_access</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess getSqlDataAccess() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess) getValue(5);
	}

	/**
	 * Setter for <code>mysql.proc.is_deterministic</code>.
	 */
	public void setIsDeterministic(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.proc.is_deterministic</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic getIsDeterministic() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic) getValue(6);
	}

	/**
	 * Setter for <code>mysql.proc.security_type</code>.
	 */
	public void setSecurityType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.proc.security_type</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType getSecurityType() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType) getValue(7);
	}

	/**
	 * Setter for <code>mysql.proc.param_list</code>.
	 */
	public void setParamList(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mysql.proc.param_list</code>.
	 */
	public byte[] getParamList() {
		return (byte[]) getValue(8);
	}

	/**
	 * Setter for <code>mysql.proc.returns</code>.
	 */
	public void setReturns(byte[] value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mysql.proc.returns</code>.
	 */
	public byte[] getReturns() {
		return (byte[]) getValue(9);
	}

	/**
	 * Setter for <code>mysql.proc.body</code>.
	 */
	public void setBody(byte[] value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>mysql.proc.body</code>.
	 */
	public byte[] getBody() {
		return (byte[]) getValue(10);
	}

	/**
	 * Setter for <code>mysql.proc.definer</code>.
	 */
	public void setDefiner(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>mysql.proc.definer</code>.
	 */
	public java.lang.String getDefiner() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>mysql.proc.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>mysql.proc.created</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(12);
	}

	/**
	 * Setter for <code>mysql.proc.modified</code>.
	 */
	public void setModified(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>mysql.proc.modified</code>.
	 */
	public java.sql.Timestamp getModified() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>mysql.proc.sql_mode</code>.
	 */
	public void setSqlMode(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>mysql.proc.sql_mode</code>.
	 */
	public java.lang.String getSqlMode() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>mysql.proc.comment</code>.
	 */
	public void setComment(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>mysql.proc.comment</code>.
	 */
	public java.lang.String getComment() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>mysql.proc.character_set_client</code>.
	 */
	public void setCharacterSetClient(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>mysql.proc.character_set_client</code>.
	 */
	public java.lang.String getCharacterSetClient() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>mysql.proc.collation_connection</code>.
	 */
	public void setCollationConnection(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>mysql.proc.collation_connection</code>.
	 */
	public java.lang.String getCollationConnection() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>mysql.proc.db_collation</code>.
	 */
	public void setDbCollation(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>mysql.proc.db_collation</code>.
	 */
	public java.lang.String getDbCollation() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>mysql.proc.body_utf8</code>.
	 */
	public void setBodyUtf8(byte[] value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>mysql.proc.body_utf8</code>.
	 */
	public byte[] getBodyUtf8() {
		return (byte[]) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType, byte[], byte[], byte[], java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[]> fieldsRow() {
		return (org.jooq.Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType, byte[], byte[], byte[], java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[]> valuesRow() {
		return (org.jooq.Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType> field3() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.SPECIFIC_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage> field5() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess> field6() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.SQL_DATA_ACCESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic> field7() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.IS_DETERMINISTIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType> field8() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.SECURITY_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.PARAM_LIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field10() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.RETURNS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field11() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.BODY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.DEFINER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field13() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field14() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.SQL_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.CHARACTER_SET_CLIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.COLLATION_CONNECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.DB_COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field20() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC.BODY_UTF8;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getDb();
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
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getSpecificName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage value5() {
		return getLanguage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess value6() {
		return getSqlDataAccess();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic value7() {
		return getIsDeterministic();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType value8() {
		return getSecurityType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getParamList();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value10() {
		return getReturns();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value11() {
		return getBody();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getDefiner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value13() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value14() {
		return getModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getSqlMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getCharacterSetClient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getCollationConnection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getDbCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value20() {
		return getBodyUtf8();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value1(java.lang.String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value3(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value4(java.lang.String value) {
		setSpecificName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value5(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage value) {
		setLanguage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value6(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess value) {
		setSqlDataAccess(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value7(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic value) {
		setIsDeterministic(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value8(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType value) {
		setSecurityType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value9(byte[] value) {
		setParamList(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value10(byte[] value) {
		setReturns(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value11(byte[] value) {
		setBody(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value12(java.lang.String value) {
		setDefiner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value13(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value14(java.sql.Timestamp value) {
		setModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value15(java.lang.String value) {
		setSqlMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value16(java.lang.String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value17(java.lang.String value) {
		setCharacterSetClient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value18(java.lang.String value) {
		setCollationConnection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value19(java.lang.String value) {
		setDbCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord value20(byte[] value) {
		setBodyUtf8(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcRecord values(java.lang.String value1, java.lang.String value2, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType value3, java.lang.String value4, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage value5, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess value6, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic value7, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType value8, byte[] value9, byte[] value10, byte[] value11, java.lang.String value12, java.sql.Timestamp value13, java.sql.Timestamp value14, java.lang.String value15, java.lang.String value16, java.lang.String value17, java.lang.String value18, java.lang.String value19, byte[] value20) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProcRecord
	 */
	public ProcRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC);
	}

	/**
	 * Create a detached, initialised ProcRecord
	 */
	public ProcRecord(java.lang.String db, java.lang.String name, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType type, java.lang.String specificName, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage language, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess sqlDataAccess, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic isDeterministic, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType securityType, byte[] paramList, byte[] returns, byte[] body, java.lang.String definer, java.sql.Timestamp created, java.sql.Timestamp modified, java.lang.String sqlMode, java.lang.String comment, java.lang.String characterSetClient, java.lang.String collationConnection, java.lang.String dbCollation, byte[] bodyUtf8) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC);

		setValue(0, db);
		setValue(1, name);
		setValue(2, type);
		setValue(3, specificName);
		setValue(4, language);
		setValue(5, sqlDataAccess);
		setValue(6, isDeterministic);
		setValue(7, securityType);
		setValue(8, paramList);
		setValue(9, returns);
		setValue(10, body);
		setValue(11, definer);
		setValue(12, created);
		setValue(13, modified);
		setValue(14, sqlMode);
		setValue(15, comment);
		setValue(16, characterSetClient);
		setValue(17, collationConnection);
		setValue(18, dbCollation);
		setValue(19, bodyUtf8);
	}
}
