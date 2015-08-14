/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables;

/**
 * Time zones
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZone extends org.jooq.impl.TableImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord> {

	private static final long serialVersionUID = -2043943094;

	/**
	 * The reference instance of <code>mysql.time_zone</code>
	 */
	public static final com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone TIME_ZONE = new com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord> getRecordType() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord.class;
	}

	/**
	 * The column <code>mysql.time_zone.Time_zone_id</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord, org.jooq.types.UInteger> TIME_ZONE_ID = createField("Time_zone_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone.Use_leap_seconds</code>.
	 */
	public final org.jooq.TableField<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord, com.davidm.mykindlenews.generated.jooq.mysql.enums.TimeZoneUseLeapSeconds> USE_LEAP_SECONDS = createField("Use_leap_seconds", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.davidm.mykindlenews.generated.jooq.mysql.enums.TimeZoneUseLeapSeconds.class), this, "");

	/**
	 * Create a <code>mysql.time_zone</code> table reference
	 */
	public TimeZone() {
		this("time_zone", null);
	}

	/**
	 * Create an aliased <code>mysql.time_zone</code> table reference
	 */
	public TimeZone(java.lang.String alias) {
		this(alias, com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone.TIME_ZONE);
	}

	private TimeZone(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimeZone(java.lang.String alias, org.jooq.Table<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL, aliased, parameters, "Time zones");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord, org.jooq.types.UInteger> getIdentity() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.IDENTITY_TIME_ZONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord> getPrimaryKey() {
		return com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_TIME_ZONE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.TimeZoneRecord>>asList(com.davidm.mykindlenews.generated.jooq.mysql.Keys.KEY_TIME_ZONE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone as(java.lang.String alias) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone rename(java.lang.String name) {
		return new com.davidm.mykindlenews.generated.jooq.mysql.tables.TimeZone(name, null);
	}
}
