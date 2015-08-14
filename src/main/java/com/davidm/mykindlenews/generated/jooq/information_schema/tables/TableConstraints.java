/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.information_schema.tables;

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
public class TableConstraints extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = 10243444;

	/**
	 * The reference instance of <code>information_schema.TABLE_CONSTRAINTS</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints TABLE_CONSTRAINTS = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord.class;
	}

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord, java.lang.String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.TABLE_CONSTRAINTS</code> table reference
	 */
	public TableConstraints() {
		this("TABLE_CONSTRAINTS", null);
	}

	/**
	 * Create an aliased <code>information_schema.TABLE_CONSTRAINTS</code> table reference
	 */
	public TableConstraints(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}

	private TableConstraints(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord> aliased) {
		this(alias, aliased, null);
	}

	private TableConstraints(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TableConstraintsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.TableConstraints(name, null);
	}
}