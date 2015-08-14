/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

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
public class Proc extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> {

	private static final long serialVersionUID = 76316858;

	/**
	 * The reference instance of <code>mysql.proc</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc PROC = new com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord.class;
	}

	/**
	 * The column <code>mysql.proc.db</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> DB = createField("db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.type</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcType.class), this, "");

	/**
	 * The column <code>mysql.proc.specific_name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.language</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage> LANGUAGE = createField("language", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcLanguage.class), this, "");

	/**
	 * The column <code>mysql.proc.sql_data_access</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess> SQL_DATA_ACCESS = createField("sql_data_access", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSqlDataAccess.class), this, "");

	/**
	 * The column <code>mysql.proc.is_deterministic</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic> IS_DETERMINISTIC = createField("is_deterministic", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcIsDeterministic.class), this, "");

	/**
	 * The column <code>mysql.proc.security_type</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType> SECURITY_TYPE = createField("security_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.ProcSecurityType.class), this, "");

	/**
	 * The column <code>mysql.proc.param_list</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, byte[]> PARAM_LIST = createField("param_list", org.jooq.impl.SQLDataType.BLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.proc.returns</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, byte[]> RETURNS = createField("returns", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * The column <code>mysql.proc.body</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, byte[]> BODY = createField("body", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * The column <code>mysql.proc.definer</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> DEFINER = createField("definer", org.jooq.impl.SQLDataType.CHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.created</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.modified</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.sql.Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.sql_mode</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> SQL_MODE = createField("sql_mode", org.jooq.impl.SQLDataType.VARCHAR.length(478).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.proc.comment</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>mysql.proc.character_set_client</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> CHARACTER_SET_CLIENT = createField("character_set_client", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

	/**
	 * The column <code>mysql.proc.collation_connection</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> COLLATION_CONNECTION = createField("collation_connection", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

	/**
	 * The column <code>mysql.proc.db_collation</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, java.lang.String> DB_COLLATION = createField("db_collation", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

	/**
	 * The column <code>mysql.proc.body_utf8</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord, byte[]> BODY_UTF8 = createField("body_utf8", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * Create a <code>mysql.proc</code> table reference
	 */
	public Proc() {
		this("proc", null);
	}

	/**
	 * Create an aliased <code>mysql.proc</code> table reference
	 */
	public Proc(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc.PROC);
	}

	private Proc(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> aliased) {
		this(alias, aliased, null);
	}

	private Proc(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Stored Procedures");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_PROC_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.ProcRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_PROC_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.Proc(name, null);
	}
}
