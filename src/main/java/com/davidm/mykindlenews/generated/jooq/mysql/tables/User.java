/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

/**
 * Users and global privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord> {

	private static final long serialVersionUID = -1545747695;

	/**
	 * The reference instance of <code>mysql.user</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.User USER = new com.davidm.mykindlenews.generated.jooq.mysql.tables.User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord.class;
	}

	/**
	 * The column <code>mysql.user.Host</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, java.lang.String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.User</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, java.lang.String> USER_ = createField("User", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.Password</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, java.lang.String> PASSWORD = createField("Password", org.jooq.impl.SQLDataType.CHAR.length(41).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.Select_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSelectPriv> SELECT_PRIV = createField("Select_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSelectPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Insert_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserInsertPriv> INSERT_PRIV = createField("Insert_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserInsertPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Update_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserUpdatePriv> UPDATE_PRIV = createField("Update_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserUpdatePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Delete_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserDeletePriv> DELETE_PRIV = createField("Delete_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserDeletePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreatePriv> CREATE_PRIV = createField("Create_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreatePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Drop_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserDropPriv> DROP_PRIV = createField("Drop_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserDropPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Reload_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReloadPriv> RELOAD_PRIV = createField("Reload_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReloadPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Shutdown_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShutdownPriv> SHUTDOWN_PRIV = createField("Shutdown_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShutdownPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Process_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserProcessPriv> PROCESS_PRIV = createField("Process_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserProcessPriv.class), this, "");

	/**
	 * The column <code>mysql.user.File_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserFilePriv> FILE_PRIV = createField("File_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserFilePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Grant_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserGrantPriv> GRANT_PRIV = createField("Grant_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserGrantPriv.class), this, "");

	/**
	 * The column <code>mysql.user.References_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReferencesPriv> REFERENCES_PRIV = createField("References_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReferencesPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Index_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserIndexPriv> INDEX_PRIV = createField("Index_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserIndexPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Alter_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserAlterPriv> ALTER_PRIV = createField("Alter_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserAlterPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Show_db_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShowDbPriv> SHOW_DB_PRIV = createField("Show_db_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShowDbPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Super_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSuperPriv> SUPER_PRIV = createField("Super_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSuperPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_tmp_table_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField("Create_tmp_table_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateTmpTablePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Lock_tables_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserLockTablesPriv> LOCK_TABLES_PRIV = createField("Lock_tables_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserLockTablesPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Execute_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserExecutePriv> EXECUTE_PRIV = createField("Execute_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserExecutePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Repl_slave_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReplSlavePriv> REPL_SLAVE_PRIV = createField("Repl_slave_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReplSlavePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Repl_client_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReplClientPriv> REPL_CLIENT_PRIV = createField("Repl_client_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserReplClientPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateViewPriv> CREATE_VIEW_PRIV = createField("Create_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateViewPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Show_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShowViewPriv> SHOW_VIEW_PRIV = createField("Show_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserShowViewPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField("Create_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Alter_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField("Alter_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserAlterRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_user_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateUserPriv> CREATE_USER_PRIV = createField("Create_user_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateUserPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Event_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserEventPriv> EVENT_PRIV = createField("Event_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserEventPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Trigger_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserTriggerPriv> TRIGGER_PRIV = createField("Trigger_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserTriggerPriv.class), this, "");

	/**
	 * The column <code>mysql.user.Create_tablespace_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateTablespacePriv> CREATE_TABLESPACE_PRIV = createField("Create_tablespace_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserCreateTablespacePriv.class), this, "");

	/**
	 * The column <code>mysql.user.ssl_type</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSslType> SSL_TYPE = createField("ssl_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserSslType.class), this, "");

	/**
	 * The column <code>mysql.user.ssl_cipher</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, byte[]> SSL_CIPHER = createField("ssl_cipher", org.jooq.impl.SQLDataType.BLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.user.x509_issuer</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, byte[]> X509_ISSUER = createField("x509_issuer", org.jooq.impl.SQLDataType.BLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.user.x509_subject</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, byte[]> X509_SUBJECT = createField("x509_subject", org.jooq.impl.SQLDataType.BLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.user.max_questions</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, org.jooq.types.UInteger> MAX_QUESTIONS = createField("max_questions", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.max_updates</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, org.jooq.types.UInteger> MAX_UPDATES = createField("max_updates", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.max_connections</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, org.jooq.types.UInteger> MAX_CONNECTIONS = createField("max_connections", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.max_user_connections</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, org.jooq.types.UInteger> MAX_USER_CONNECTIONS = createField("max_user_connections", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.plugin</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, java.lang.String> PLUGIN = createField("plugin", org.jooq.impl.SQLDataType.CHAR.length(64).defaulted(true), this, "");

	/**
	 * The column <code>mysql.user.authentication_string</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, java.lang.String> AUTHENTICATION_STRING = createField("authentication_string", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>mysql.user.password_expired</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.UserPasswordExpired> PASSWORD_EXPIRED = createField("password_expired", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.UserPasswordExpired.class), this, "");

	/**
	 * Create a <code>mysql.user</code> table reference
	 */
	public User() {
		this("user", null);
	}

	/**
	 * Create an aliased <code>mysql.user</code> table reference
	 */
	public User(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.User.USER);
	}

	private User(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord> aliased) {
		this(alias, aliased, null);
	}

	private User(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Users and global privileges");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.UserRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_USER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.User as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.User(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.User rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.User(name, null);
	}
}