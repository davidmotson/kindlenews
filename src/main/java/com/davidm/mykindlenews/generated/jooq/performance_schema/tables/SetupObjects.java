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
public class SetupObjects extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord> {

	private static final long serialVersionUID = 1610332805;

	/**
	 * The reference instance of <code>performance_schema.setup_objects</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects SETUP_OBJECTS = new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord.class;
	}

	/**
	 * The column <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsObjectType> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsObjectType.class), this, "");

	/**
	 * The column <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord, java.lang.String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.setup_objects.OBJECT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>performance_schema.setup_objects.ENABLED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsEnabled> ENABLED = createField("ENABLED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsEnabled.class), this, "");

	/**
	 * The column <code>performance_schema.setup_objects.TIMED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsTimed> TIMED = createField("TIMED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.SetupObjectsTimed.class), this, "");

	/**
	 * Create a <code>performance_schema.setup_objects</code> table reference
	 */
	public SetupObjects() {
		this("setup_objects", null);
	}

	/**
	 * Create an aliased <code>performance_schema.setup_objects</code> table reference
	 */
	public SetupObjects(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects.SETUP_OBJECTS);
	}

	private SetupObjects(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord> aliased) {
		this(alias, aliased, null);
	}

	private SetupObjects(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.SetupObjectsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.performance_schema.tables.SetupObjects(name, null);
	}
}
