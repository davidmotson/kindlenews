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
public class InnodbBufferPoolStats extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord> {

	private static final long serialVersionUID = -1495539711;

	/**
	 * The reference instance of <code>information_schema.INNODB_BUFFER_POOL_STATS</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> POOL_ID = createField("POOL_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> POOL_SIZE = createField("POOL_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> FREE_BUFFERS = createField("FREE_BUFFERS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> DATABASE_PAGES = createField("DATABASE_PAGES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> OLD_DATABASE_PAGES = createField("OLD_DATABASE_PAGES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> MODIFIED_DATABASE_PAGES = createField("MODIFIED_DATABASE_PAGES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PENDING_DECOMPRESS = createField("PENDING_DECOMPRESS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PENDING_READS = createField("PENDING_READS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PENDING_FLUSH_LRU = createField("PENDING_FLUSH_LRU", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PENDING_FLUSH_LIST = createField("PENDING_FLUSH_LIST", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PAGES_MADE_YOUNG = createField("PAGES_MADE_YOUNG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> PAGES_NOT_MADE_YOUNG = createField("PAGES_NOT_MADE_YOUNG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> PAGES_MADE_YOUNG_RATE = createField("PAGES_MADE_YOUNG_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> PAGES_MADE_NOT_YOUNG_RATE = createField("PAGES_MADE_NOT_YOUNG_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_PAGES_READ = createField("NUMBER_PAGES_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_PAGES_CREATED = createField("NUMBER_PAGES_CREATED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_PAGES_WRITTEN = createField("NUMBER_PAGES_WRITTEN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> PAGES_READ_RATE = createField("PAGES_READ_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> PAGES_CREATE_RATE = createField("PAGES_CREATE_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> PAGES_WRITTEN_RATE = createField("PAGES_WRITTEN_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_PAGES_GET = createField("NUMBER_PAGES_GET", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> HIT_RATE = createField("HIT_RATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> YOUNG_MAKE_PER_THOUSAND_GETS = createField("YOUNG_MAKE_PER_THOUSAND_GETS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NOT_YOUNG_MAKE_PER_THOUSAND_GETS = createField("NOT_YOUNG_MAKE_PER_THOUSAND_GETS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_PAGES_READ_AHEAD = createField("NUMBER_PAGES_READ_AHEAD", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> NUMBER_READ_AHEAD_EVICTED = createField("NUMBER_READ_AHEAD_EVICTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> READ_AHEAD_RATE = createField("READ_AHEAD_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, java.lang.Double> READ_AHEAD_EVICTED_RATE = createField("READ_AHEAD_EVICTED_RATE", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> LRU_IO_TOTAL = createField("LRU_IO_TOTAL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> LRU_IO_CURRENT = createField("LRU_IO_CURRENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> UNCOMPRESS_TOTAL = createField("UNCOMPRESS_TOTAL", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord, org.jooq.types.ULong> UNCOMPRESS_CURRENT = createField("UNCOMPRESS_CURRENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
	 */
	public InnodbBufferPoolStats() {
		this("INNODB_BUFFER_POOL_STATS", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_BUFFER_POOL_STATS</code> table reference
	 */
	public InnodbBufferPoolStats(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS);
	}

	private InnodbBufferPoolStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbBufferPoolStats(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbBufferPoolStatsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbBufferPoolStats(name, null);
	}
}
