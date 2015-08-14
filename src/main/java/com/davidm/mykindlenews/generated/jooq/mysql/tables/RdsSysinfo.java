/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

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
public class RdsSysinfo extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord> {

	private static final long serialVersionUID = -1438344904;

	/**
	 * The reference instance of <code>mysql.rds_sysinfo</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo RDS_SYSINFO = new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord.class;
	}

	/**
	 * The column <code>mysql.rds_sysinfo.name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

	/**
	 * The column <code>mysql.rds_sysinfo.value</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * Create a <code>mysql.rds_sysinfo</code> table reference
	 */
	public RdsSysinfo() {
		this("rds_sysinfo", null);
	}

	/**
	 * Create an aliased <code>mysql.rds_sysinfo</code> table reference
	 */
	public RdsSysinfo(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo.RDS_SYSINFO);
	}

	private RdsSysinfo(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private RdsSysinfo(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsSysinfoRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsSysinfo(name, null);
	}
}