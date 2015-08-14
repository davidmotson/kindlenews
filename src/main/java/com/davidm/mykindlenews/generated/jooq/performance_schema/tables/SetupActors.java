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
public class SetupActors extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord> {

	private static final long serialVersionUID = 89277896;

	/**
	 * The reference instance of <code>performance_schema.setup_actors</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors SETUP_ACTORS = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord.class;
	}

	/**
	 * The column <code>performance_schema.setup_actors.HOST</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord, java.lang.String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.setup_actors.USER</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord, java.lang.String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.setup_actors.ROLE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord, java.lang.String> ROLE = createField("ROLE", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>performance_schema.setup_actors</code> table reference
	 */
	public SetupActors() {
		this("setup_actors", null);
	}

	/**
	 * Create an aliased <code>performance_schema.setup_actors</code> table reference
	 */
	public SetupActors(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors.SETUP_ACTORS);
	}

	private SetupActors(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SetupActors(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupActorsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupActors(name, null);
	}
}