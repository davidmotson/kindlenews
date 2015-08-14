/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.routines;

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
public class RdsSetExternalMaster extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -925362263;

	/**
	 * The parameter <code>mysql.rds_set_external_master.host</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> HOST = createParameter("host", org.jooq.impl.SQLDataType.VARCHAR.length(255), false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.port</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> PORT = createParameter("port", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.user</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> USER = createParameter("user", org.jooq.impl.SQLDataType.VARCHAR.length(16), false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.passwd</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> PASSWD = createParameter("passwd", org.jooq.impl.SQLDataType.VARCHAR.length(256), false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.name</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> NAME = createParameter("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.pos</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> POS = createParameter("pos", org.jooq.impl.SQLDataType.CLOB.length(16777215), false);

	/**
	 * The parameter <code>mysql.rds_set_external_master.enable_ssl_encryption</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Byte> ENABLE_SSL_ENCRYPTION = createParameter("enable_ssl_encryption", org.jooq.impl.SQLDataType.TINYINT, false);

	/**
	 * Create a new routine call instance
	 */
	public RdsSetExternalMaster() {
		super("rds_set_external_master", com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL);

		addInParameter(HOST);
		addInParameter(PORT);
		addInParameter(USER);
		addInParameter(PASSWD);
		addInParameter(NAME);
		addInParameter(POS);
		addInParameter(ENABLE_SSL_ENCRYPTION);
	}

	/**
	 * Set the <code>host</code> parameter IN value to the routine
	 */
	public void setHost(java.lang.String value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.HOST, value);
	}

	/**
	 * Set the <code>port</code> parameter IN value to the routine
	 */
	public void setPort(java.lang.Integer value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.PORT, value);
	}

	/**
	 * Set the <code>user</code> parameter IN value to the routine
	 */
	public void setUser(java.lang.String value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.USER, value);
	}

	/**
	 * Set the <code>passwd</code> parameter IN value to the routine
	 */
	public void setPasswd(java.lang.String value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.PASSWD, value);
	}

	/**
	 * Set the <code>name</code> parameter IN value to the routine
	 */
	public void setName_(java.lang.String value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.NAME, value);
	}

	/**
	 * Set the <code>pos</code> parameter IN value to the routine
	 */
	public void setPos(java.lang.String value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.POS, value);
	}

	/**
	 * Set the <code>enable_ssl_encryption</code> parameter IN value to the routine
	 */
	public void setEnableSslEncryption(java.lang.Byte value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster.ENABLE_SSL_ENCRYPTION, value);
	}
}