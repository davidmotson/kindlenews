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
public class SessionConnectAttrs extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord> {

	private static final long serialVersionUID = 208630307;

	/**
	 * The reference instance of <code>performance_schema.session_connect_attrs</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs SESSION_CONNECT_ATTRS = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord.class;
	}

	/**
	 * The column <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord, java.lang.Integer> PROCESSLIST_ID = createField("PROCESSLIST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord, java.lang.String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord, java.lang.String> ATTR_VALUE = createField("ATTR_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord, java.lang.Integer> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>performance_schema.session_connect_attrs</code> table reference
	 */
	public SessionConnectAttrs() {
		this("session_connect_attrs", null);
	}

	/**
	 * Create an aliased <code>performance_schema.session_connect_attrs</code> table reference
	 */
	public SessionConnectAttrs(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS);
	}

	private SessionConnectAttrs(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SessionConnectAttrs(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SessionConnectAttrsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SessionConnectAttrs(name, null);
	}
}
