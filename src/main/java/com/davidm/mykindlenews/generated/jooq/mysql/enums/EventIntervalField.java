/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.enums;

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
public enum EventIntervalField implements org.jooq.EnumType {

	YEAR("YEAR"),

	QUARTER("QUARTER"),

	MONTH("MONTH"),

	DAY("DAY"),

	HOUR("HOUR"),

	MINUTE("MINUTE"),

	WEEK("WEEK"),

	SECOND("SECOND"),

	MICROSECOND("MICROSECOND"),

	YEAR_MONTH("YEAR_MONTH"),

	DAY_HOUR("DAY_HOUR"),

	DAY_MINUTE("DAY_MINUTE"),

	DAY_SECOND("DAY_SECOND"),

	HOUR_MINUTE("HOUR_MINUTE"),

	HOUR_SECOND("HOUR_SECOND"),

	MINUTE_SECOND("MINUTE_SECOND"),

	DAY_MICROSECOND("DAY_MICROSECOND"),

	HOUR_MICROSECOND("HOUR_MICROSECOND"),

	MINUTE_MICROSECOND("MINUTE_MICROSECOND"),

	SECOND_MICROSECOND("SECOND_MICROSECOND");

	private final java.lang.String literal;

	private EventIntervalField(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "event_interval_field";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
