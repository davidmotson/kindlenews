/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

/**
 * Host privileges;  Merged with database privileges
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Host extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord> {

	private static final long serialVersionUID = 540706905;

	/**
	 * The reference instance of <code>mysql.host</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.Host HOST = new com.davidm.mykindlenews.generated.jooq.mysql.tables.Host();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord.class;
	}

	/**
	 * The column <code>mysql.host.Host</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, java.lang.String> HOST_ = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.host.Db</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, java.lang.String> DB = createField("Db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.host.Select_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostSelectPriv> SELECT_PRIV = createField("Select_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostSelectPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Insert_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostInsertPriv> INSERT_PRIV = createField("Insert_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostInsertPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Update_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostUpdatePriv> UPDATE_PRIV = createField("Update_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostUpdatePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Delete_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostDeletePriv> DELETE_PRIV = createField("Delete_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostDeletePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Create_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreatePriv> CREATE_PRIV = createField("Create_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreatePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Drop_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostDropPriv> DROP_PRIV = createField("Drop_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostDropPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Grant_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostGrantPriv> GRANT_PRIV = createField("Grant_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostGrantPriv.class), this, "");

	/**
	 * The column <code>mysql.host.References_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostReferencesPriv> REFERENCES_PRIV = createField("References_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostReferencesPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Index_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostIndexPriv> INDEX_PRIV = createField("Index_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostIndexPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Alter_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostAlterPriv> ALTER_PRIV = createField("Alter_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostAlterPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Create_tmp_table_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField("Create_tmp_table_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateTmpTablePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Lock_tables_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostLockTablesPriv> LOCK_TABLES_PRIV = createField("Lock_tables_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostLockTablesPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Create_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateViewPriv> CREATE_VIEW_PRIV = createField("Create_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateViewPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Show_view_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostShowViewPriv> SHOW_VIEW_PRIV = createField("Show_view_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostShowViewPriv.class), this, "");

	/**
	 * The column <code>mysql.host.Create_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField("Create_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostCreateRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Alter_routine_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField("Alter_routine_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostAlterRoutinePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Execute_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostExecutePriv> EXECUTE_PRIV = createField("Execute_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostExecutePriv.class), this, "");

	/**
	 * The column <code>mysql.host.Trigger_priv</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.HostTriggerPriv> TRIGGER_PRIV = createField("Trigger_priv", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.HostTriggerPriv.class), this, "");

	/**
	 * Create a <code>mysql.host</code> table reference
	 */
	public Host() {
		this("host", null);
	}

	/**
	 * Create an aliased <code>mysql.host</code> table reference
	 */
	public Host(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.Host.HOST);
	}

	private Host(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord> aliased) {
		this(alias, aliased, null);
	}

	private Host(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Host privileges;  Merged with database privileges");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_HOST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HostRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_HOST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Host as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Host(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Host rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Host(name, null);
	}
}