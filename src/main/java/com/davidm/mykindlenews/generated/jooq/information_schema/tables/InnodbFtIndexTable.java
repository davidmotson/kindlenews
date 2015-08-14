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
public class InnodbFtIndexTable extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord> {

	private static final long serialVersionUID = 1416517112;

	/**
	 * The reference instance of <code>information_schema.INNODB_FT_INDEX_TABLE</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable INNODB_FT_INDEX_TABLE = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.WORD</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, java.lang.String> WORD = createField("WORD", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, org.jooq.types.ULong> FIRST_DOC_ID = createField("FIRST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.LAST_DOC_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, org.jooq.types.ULong> LAST_DOC_ID = createField("LAST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_COUNT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, org.jooq.types.ULong> DOC_COUNT = createField("DOC_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, org.jooq.types.ULong> DOC_ID = createField("DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_TABLE.POSITION</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord, org.jooq.types.ULong> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_FT_INDEX_TABLE</code> table reference
	 */
	public InnodbFtIndexTable() {
		this("INNODB_FT_INDEX_TABLE", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_FT_INDEX_TABLE</code> table reference
	 */
	public InnodbFtIndexTable(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable.INNODB_FT_INDEX_TABLE);
	}

	private InnodbFtIndexTable(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbFtIndexTable(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtIndexTableRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtIndexTable(name, null);
	}
}