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
public class InnodbCmpmem extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord> {

	private static final long serialVersionUID = 1635500863;

	/**
	 * The reference instance of <code>information_schema.INNODB_CMPMEM</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem INNODB_CMPMEM = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.page_size</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Integer> BUFFER_POOL_INSTANCE = createField("buffer_pool_instance", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.pages_used</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Integer> PAGES_USED = createField("pages_used", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.pages_free</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Integer> PAGES_FREE = createField("pages_free", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Long> RELOCATION_OPS = createField("relocation_ops", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord, java.lang.Integer> RELOCATION_TIME = createField("relocation_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_CMPMEM</code> table reference
	 */
	public InnodbCmpmem() {
		this("INNODB_CMPMEM", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table reference
	 */
	public InnodbCmpmem(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem.INNODB_CMPMEM);
	}

	private InnodbCmpmem(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbCmpmem(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbCmpmemRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbCmpmem(name, null);
	}
}