/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

/**
 * help keywords
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeyword extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord> {

	private static final long serialVersionUID = 993623745;

	/**
	 * The reference instance of <code>mysql.help_keyword</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword HELP_KEYWORD = new com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord.class;
	}

	/**
	 * The column <code>mysql.help_keyword.help_keyword_id</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord, org.jooq.types.UInteger> HELP_KEYWORD_ID = createField("help_keyword_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.help_keyword.name</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

	/**
	 * Create a <code>mysql.help_keyword</code> table reference
	 */
	public HelpKeyword() {
		this("help_keyword", null);
	}

	/**
	 * Create an aliased <code>mysql.help_keyword</code> table reference
	 */
	public HelpKeyword(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword.HELP_KEYWORD);
	}

	private HelpKeyword(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord> aliased) {
		this(alias, aliased, null);
	}

	private HelpKeyword(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "help keywords");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_HELP_KEYWORD_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.HelpKeywordRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_HELP_KEYWORD_PRIMARY, com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_HELP_KEYWORD_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.HelpKeyword(name, null);
	}
}
