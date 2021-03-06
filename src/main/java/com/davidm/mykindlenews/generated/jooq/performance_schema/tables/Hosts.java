/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.performance_schema.tables;

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
public class Hosts extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord> {

	private static final long serialVersionUID = -1644073713;

	/**
	 * The reference instance of <code>performance_schema.hosts</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts HOSTS = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord.class;
	}

	/**
	 * The column <code>performance_schema.hosts.HOST</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord, java.lang.String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60), this, "");

	/**
	 * The column <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord, java.lang.Long> CURRENT_CONNECTIONS = createField("CURRENT_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord, java.lang.Long> TOTAL_CONNECTIONS = createField("TOTAL_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.hosts</code> table reference
	 */
	public Hosts() {
		this("hosts", null);
	}

	/**
	 * Create an aliased <code>performance_schema.hosts</code> table reference
	 */
	public Hosts(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts.HOSTS);
	}

	private Hosts(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Hosts(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.HostsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Hosts(name, null);
	}
}
