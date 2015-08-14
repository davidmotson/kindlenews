/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

/**
 * Master Information
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveMasterInfo extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord> {

	private static final long serialVersionUID = -1917844042;

	/**
	 * The reference instance of <code>mysql.slave_master_info</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo SLAVE_MASTER_INFO = new com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord.class;
	}

	/**
	 * The column <code>mysql.slave_master_info.Number_of_lines</code>. Number of lines in the file.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, org.jooq.types.UInteger> NUMBER_OF_LINES = createField("Number_of_lines", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "Number of lines in the file.");

	/**
	 * The column <code>mysql.slave_master_info.Master_log_name</code>. The name of the master binary log currently being read from the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> MASTER_LOG_NAME = createField("Master_log_name", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "The name of the master binary log currently being read from the master.");

	/**
	 * The column <code>mysql.slave_master_info.Master_log_pos</code>. The master log position of the last read event.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, org.jooq.types.ULong> MASTER_LOG_POS = createField("Master_log_pos", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The master log position of the last read event.");

	/**
	 * The column <code>mysql.slave_master_info.Host</code>. The host name of the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR.length(255).nullable(false).defaulted(true), this, "The host name of the master.");

	/**
	 * The column <code>mysql.slave_master_info.User_name</code>. The user name used to connect to the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> USER_NAME = createField("User_name", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The user name used to connect to the master.");

	/**
	 * The column <code>mysql.slave_master_info.User_password</code>. The password used to connect to the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> USER_PASSWORD = createField("User_password", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The password used to connect to the master.");

	/**
	 * The column <code>mysql.slave_master_info.Port</code>. The network port used to connect to the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, org.jooq.types.UInteger> PORT = createField("Port", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "The network port used to connect to the master.");

	/**
	 * The column <code>mysql.slave_master_info.Connect_retry</code>. The period (in seconds) that the slave will wait before trying to reconnect to the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, org.jooq.types.UInteger> CONNECT_RETRY = createField("Connect_retry", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "The period (in seconds) that the slave will wait before trying to reconnect to the master.");

	/**
	 * The column <code>mysql.slave_master_info.Enabled_ssl</code>. Indicates whether the server supports SSL connections.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.Byte> ENABLED_SSL = createField("Enabled_ssl", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "Indicates whether the server supports SSL connections.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_ca</code>. The file used for the Certificate Authority (CA) certificate.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CA = createField("Ssl_ca", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The file used for the Certificate Authority (CA) certificate.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_capath</code>. The path to the Certificate Authority (CA) certificates.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CAPATH = createField("Ssl_capath", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The path to the Certificate Authority (CA) certificates.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_cert</code>. The name of the SSL certificate file.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CERT = createField("Ssl_cert", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The name of the SSL certificate file.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_cipher</code>. The name of the cipher in use for the SSL connection.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CIPHER = createField("Ssl_cipher", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The name of the cipher in use for the SSL connection.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_key</code>. The name of the SSL key file.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_KEY = createField("Ssl_key", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The name of the SSL key file.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_verify_server_cert</code>. Whether to verify the server certificate.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.Byte> SSL_VERIFY_SERVER_CERT = createField("Ssl_verify_server_cert", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "Whether to verify the server certificate.");

	/**
	 * The column <code>mysql.slave_master_info.Heartbeat</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.Double> HEARTBEAT = createField("Heartbeat", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

	/**
	 * The column <code>mysql.slave_master_info.Bind</code>. Displays which interface is employed when connecting to the MySQL server
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> BIND = createField("Bind", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "Displays which interface is employed when connecting to the MySQL server");

	/**
	 * The column <code>mysql.slave_master_info.Ignored_server_ids</code>. The number of server IDs to be ignored, followed by the actual server IDs
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> IGNORED_SERVER_IDS = createField("Ignored_server_ids", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The number of server IDs to be ignored, followed by the actual server IDs");

	/**
	 * The column <code>mysql.slave_master_info.Uuid</code>. The master server uuid.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> UUID = createField("Uuid", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The master server uuid.");

	/**
	 * The column <code>mysql.slave_master_info.Retry_count</code>. Number of reconnect attempts, to the master, before giving up.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, org.jooq.types.ULong> RETRY_COUNT = createField("Retry_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Number of reconnect attempts, to the master, before giving up.");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_crl</code>. The file used for the Certificate Revocation List (CRL)
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CRL = createField("Ssl_crl", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The file used for the Certificate Revocation List (CRL)");

	/**
	 * The column <code>mysql.slave_master_info.Ssl_crlpath</code>. The path used for Certificate Revocation List (CRL) files
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.String> SSL_CRLPATH = createField("Ssl_crlpath", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "The path used for Certificate Revocation List (CRL) files");

	/**
	 * The column <code>mysql.slave_master_info.Enabled_auto_position</code>. Indicates whether GTIDs will be used to retrieve events from the master.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord, java.lang.Byte> ENABLED_AUTO_POSITION = createField("Enabled_auto_position", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "Indicates whether GTIDs will be used to retrieve events from the master.");

	/**
	 * Create a <code>mysql.slave_master_info</code> table reference
	 */
	public SlaveMasterInfo() {
		this("slave_master_info", null);
	}

	/**
	 * Create an aliased <code>mysql.slave_master_info</code> table reference
	 */
	public SlaveMasterInfo(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo.SLAVE_MASTER_INFO);
	}

	private SlaveMasterInfo(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private SlaveMasterInfo(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Master Information");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_SLAVE_MASTER_INFO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.SlaveMasterInfoRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_SLAVE_MASTER_INFO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.SlaveMasterInfo(name, null);
	}
}
