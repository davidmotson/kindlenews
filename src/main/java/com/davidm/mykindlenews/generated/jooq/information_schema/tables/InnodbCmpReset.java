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
public class InnodbCmpReset extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord> {

	private static final long serialVersionUID = -242734351;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMP_RESET</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset INNODB_CMP_RESET = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.page_size</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_ops</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> COMPRESS_OPS = createField("compress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_ops_ok</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> COMPRESS_OPS_OK = createField("compress_ops_ok", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.compress_time</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> COMPRESS_TIME = createField("compress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.uncompress_ops</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> UNCOMPRESS_OPS = createField("uncompress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMP_RESET.uncompress_time</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord, java.lang.Integer> UNCOMPRESS_TIME = createField("uncompress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMP_RESET</code> table reference
	 */
	public InnodbCmpReset() {
		this("INNODB_CMP_RESET", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMP_RESET</code> table reference
	 */
	public InnodbCmpReset(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset.INNODB_CMP_RESET);
	}

	private InnodbCmpReset(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmpReset(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpResetRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpReset(name, null);
	}
}
