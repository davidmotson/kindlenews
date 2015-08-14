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
public class RdsHeartbeat2 extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record> {

	private static final long serialVersionUID = 915833827;

	/**
	 * The reference instance of <code>mysql.rds_heartbeat2</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2 RDS_HEARTBEAT2 = new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record.class;
	}

	/**
	 * The column <code>mysql.rds_heartbeat2.id</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>mysql.rds_heartbeat2.value</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record, java.lang.Long> VALUE = createField("value", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>mysql.rds_heartbeat2</code> table reference
	 */
	public RdsHeartbeat2() {
		this("rds_heartbeat2", null);
	}

	/**
	 * Create an aliased <code>mysql.rds_heartbeat2</code> table reference
	 */
	public RdsHeartbeat2(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2.RDS_HEARTBEAT2);
	}

	private RdsHeartbeat2(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record> aliased) {
		this(alias, aliased, null);
	}

	private RdsHeartbeat2(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_RDS_HEARTBEAT2_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsHeartbeat2Record>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_RDS_HEARTBEAT2_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2 as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2 rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsHeartbeat2(name, null);
	}
}