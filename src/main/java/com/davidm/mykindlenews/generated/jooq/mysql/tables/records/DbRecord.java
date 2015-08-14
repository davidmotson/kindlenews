/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables.records;

/**
 * Database privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbRecord extends org.jooq.impl.UpdatableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> implements org.jooq.Record22<java.lang.String, java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv> {

	private static final long serialVersionUID = 1257672027;

	/**
	 * Setter for <code>mysql.db.Host</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.db.Host</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.db.Db</code>.
	 */
	public void setDb(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.db.Db</code>.
	 */
	public java.lang.String getDb() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.db.User</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.db.User</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.db.Select_priv</code>.
	 */
	public void setSelectPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.db.Select_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv getSelectPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv) getValue(3);
	}

	/**
	 * Setter for <code>mysql.db.Insert_priv</code>.
	 */
	public void setInsertPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.db.Insert_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv getInsertPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv) getValue(4);
	}

	/**
	 * Setter for <code>mysql.db.Update_priv</code>.
	 */
	public void setUpdatePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.db.Update_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv getUpdatePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv) getValue(5);
	}

	/**
	 * Setter for <code>mysql.db.Delete_priv</code>.
	 */
	public void setDeletePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>mysql.db.Delete_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv getDeletePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv) getValue(6);
	}

	/**
	 * Setter for <code>mysql.db.Create_priv</code>.
	 */
	public void setCreatePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>mysql.db.Create_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv getCreatePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv) getValue(7);
	}

	/**
	 * Setter for <code>mysql.db.Drop_priv</code>.
	 */
	public void setDropPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>mysql.db.Drop_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv getDropPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv) getValue(8);
	}

	/**
	 * Setter for <code>mysql.db.Grant_priv</code>.
	 */
	public void setGrantPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>mysql.db.Grant_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv getGrantPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv) getValue(9);
	}

	/**
	 * Setter for <code>mysql.db.References_priv</code>.
	 */
	public void setReferencesPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>mysql.db.References_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv getReferencesPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv) getValue(10);
	}

	/**
	 * Setter for <code>mysql.db.Index_priv</code>.
	 */
	public void setIndexPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>mysql.db.Index_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv getIndexPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv) getValue(11);
	}

	/**
	 * Setter for <code>mysql.db.Alter_priv</code>.
	 */
	public void setAlterPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>mysql.db.Alter_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv getAlterPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv) getValue(12);
	}

	/**
	 * Setter for <code>mysql.db.Create_tmp_table_priv</code>.
	 */
	public void setCreateTmpTablePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>mysql.db.Create_tmp_table_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv getCreateTmpTablePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv) getValue(13);
	}

	/**
	 * Setter for <code>mysql.db.Lock_tables_priv</code>.
	 */
	public void setLockTablesPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>mysql.db.Lock_tables_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv getLockTablesPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv) getValue(14);
	}

	/**
	 * Setter for <code>mysql.db.Create_view_priv</code>.
	 */
	public void setCreateViewPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>mysql.db.Create_view_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv getCreateViewPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv) getValue(15);
	}

	/**
	 * Setter for <code>mysql.db.Show_view_priv</code>.
	 */
	public void setShowViewPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>mysql.db.Show_view_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv getShowViewPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv) getValue(16);
	}

	/**
	 * Setter for <code>mysql.db.Create_routine_priv</code>.
	 */
	public void setCreateRoutinePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>mysql.db.Create_routine_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv getCreateRoutinePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv) getValue(17);
	}

	/**
	 * Setter for <code>mysql.db.Alter_routine_priv</code>.
	 */
	public void setAlterRoutinePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>mysql.db.Alter_routine_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv getAlterRoutinePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv) getValue(18);
	}

	/**
	 * Setter for <code>mysql.db.Execute_priv</code>.
	 */
	public void setExecutePriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>mysql.db.Execute_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv getExecutePriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv) getValue(19);
	}

	/**
	 * Setter for <code>mysql.db.Event_priv</code>.
	 */
	public void setEventPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>mysql.db.Event_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv getEventPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv) getValue(20);
	}

	/**
	 * Setter for <code>mysql.db.Trigger_priv</code>.
	 */
	public void setTriggerPriv(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>mysql.db.Trigger_priv</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv getTriggerPriv() {
		return (com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv) getValue(21);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv> fieldsRow() {
		return (org.jooq.Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv> valuesRow() {
		return (org.jooq.Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.DB_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv> field4() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.SELECT_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv> field5() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.INSERT_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv> field6() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.UPDATE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv> field7() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.DELETE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv> field8() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.CREATE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv> field9() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.DROP_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv> field10() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.GRANT_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv> field11() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.REFERENCES_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv> field12() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.INDEX_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv> field13() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.ALTER_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv> field14() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.CREATE_TMP_TABLE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv> field15() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.LOCK_TABLES_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv> field16() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.CREATE_VIEW_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv> field17() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.SHOW_VIEW_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv> field18() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.CREATE_ROUTINE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv> field19() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.ALTER_ROUTINE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv> field20() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.EXECUTE_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv> field21() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.EVENT_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv> field22() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB.TRIGGER_PRIV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv value4() {
		return getSelectPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv value5() {
		return getInsertPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv value6() {
		return getUpdatePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv value7() {
		return getDeletePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv value8() {
		return getCreatePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv value9() {
		return getDropPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv value10() {
		return getGrantPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv value11() {
		return getReferencesPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv value12() {
		return getIndexPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv value13() {
		return getAlterPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv value14() {
		return getCreateTmpTablePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv value15() {
		return getLockTablesPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv value16() {
		return getCreateViewPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv value17() {
		return getShowViewPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv value18() {
		return getCreateRoutinePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv value19() {
		return getAlterRoutinePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv value20() {
		return getExecutePriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv value21() {
		return getEventPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv value22() {
		return getTriggerPriv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value1(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value2(java.lang.String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value3(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value4(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv value) {
		setSelectPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value5(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv value) {
		setInsertPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value6(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv value) {
		setUpdatePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value7(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv value) {
		setDeletePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value8(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv value) {
		setCreatePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value9(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv value) {
		setDropPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value10(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv value) {
		setGrantPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value11(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv value) {
		setReferencesPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value12(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv value) {
		setIndexPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value13(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv value) {
		setAlterPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value14(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv value) {
		setCreateTmpTablePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value15(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv value) {
		setLockTablesPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value16(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv value) {
		setCreateViewPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value17(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv value) {
		setShowViewPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value18(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv value) {
		setCreateRoutinePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value19(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv value) {
		setAlterRoutinePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value20(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv value) {
		setExecutePriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value21(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv value) {
		setEventPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord value22(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv value) {
		setTriggerPriv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DbRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv value4, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv value5, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv value6, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv value7, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv value8, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv value9, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv value10, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv value11, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv value12, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv value13, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv value14, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv value15, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv value16, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv value17, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv value18, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv value19, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv value20, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv value21, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv value22) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DbRecord
	 */
	public DbRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB);
	}

	/**
	 * Create a detached, initialised DbRecord
	 */
	public DbRecord(java.lang.String host, java.lang.String db, java.lang.String user, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv selectPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv insertPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv updatePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv deletePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv createPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv dropPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv grantPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv referencesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv indexPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv alterPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv createTmpTablePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv lockTablesPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv createViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv showViewPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv createRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv alterRoutinePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv executePriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv eventPriv, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv triggerPriv) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB);

		setValue(0, host);
		setValue(1, db);
		setValue(2, user);
		setValue(3, selectPriv);
		setValue(4, insertPriv);
		setValue(5, updatePriv);
		setValue(6, deletePriv);
		setValue(7, createPriv);
		setValue(8, dropPriv);
		setValue(9, grantPriv);
		setValue(10, referencesPriv);
		setValue(11, indexPriv);
		setValue(12, alterPriv);
		setValue(13, createTmpTablePriv);
		setValue(14, lockTablesPriv);
		setValue(15, createViewPriv);
		setValue(16, showViewPriv);
		setValue(17, createRoutinePriv);
		setValue(18, alterRoutinePriv);
		setValue(19, executePriv);
		setValue(20, eventPriv);
		setValue(21, triggerPriv);
	}
}
