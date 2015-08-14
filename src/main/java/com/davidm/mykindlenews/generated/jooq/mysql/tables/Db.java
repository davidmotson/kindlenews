/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

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
public class Db extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> {

	private static final long serialVersionUID = -215127374;

	/**
	 * The reference instance of <code>mysql.db</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.Db DB = new com.davidm.mykindlenews.generated.jooq.mysql.tables.Db();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord.class;
	}

	/**
	 * The column <code>mysql.db.Host</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, java.lang.String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.db.Db</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, java.lang.String> DB_ = createField("Db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.db.User</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, java.lang.String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.db.Select_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv> SELECT_PRIV = createField("Select_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbSelectPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Insert_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv> INSERT_PRIV = createField("Insert_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbInsertPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Update_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv> UPDATE_PRIV = createField("Update_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbUpdatePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Delete_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv> DELETE_PRIV = createField("Delete_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDeletePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Create_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv> CREATE_PRIV = createField("Create_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreatePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Drop_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv> DROP_PRIV = createField("Drop_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbDropPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Grant_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv> GRANT_PRIV = createField("Grant_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbGrantPriv.class), this, "");

	/**
	 * The column <code>mysql.db.References_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv> REFERENCES_PRIV = createField("References_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbReferencesPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Index_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv> INDEX_PRIV = createField("Index_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbIndexPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Alter_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv> ALTER_PRIV = createField("Alter_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Create_tmp_table_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField("Create_tmp_table_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateTmpTablePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Lock_tables_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv> LOCK_TABLES_PRIV = createField("Lock_tables_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbLockTablesPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Create_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv> CREATE_VIEW_PRIV = createField("Create_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateViewPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Show_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv> SHOW_VIEW_PRIV = createField("Show_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbShowViewPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Create_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField("Create_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbCreateRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Alter_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField("Alter_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbAlterRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Execute_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv> EXECUTE_PRIV = createField("Execute_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbExecutePriv.class), this, "");

	/**
	 * The column <code>mysql.db.Event_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv> EVENT_PRIV = createField("Event_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbEventPriv.class), this, "");

	/**
	 * The column <code>mysql.db.Trigger_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv> TRIGGER_PRIV = createField("Trigger_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.DbTriggerPriv.class), this, "");

	/**
	 * Create a <code>mysql.db</code> table reference
	 */
	public Db() {
		this("db", null);
	}

	/**
	 * Create an aliased <code>mysql.db</code> table reference
	 */
	public Db(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.Db.DB);
	}

	private Db(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> aliased) {
		this(alias, aliased, null);
	}

	private Db(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Database privileges");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_DB_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.DbRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_DB_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Db as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Db(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Db rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Db(name, null);
	}
}
