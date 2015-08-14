/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.information_schema.tables.records;

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
public class CollationCharacterSetApplicabilityRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.CollationCharacterSetApplicabilityRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 968894594;

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public void setCollationName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
	 */
	public java.lang.String getCollationName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
	 */
	public java.lang.String getCharacterSetName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCollationName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCharacterSetName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord value1(java.lang.String value) {
		setCollationName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord value2(java.lang.String value) {
		setCharacterSetName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CollationCharacterSetApplicabilityRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CollationCharacterSetApplicabilityRecord
	 */
	public CollationCharacterSetApplicabilityRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
	}

	/**
	 * Create a detached, initialised CollationCharacterSetApplicabilityRecord
	 */
	public CollationCharacterSetApplicabilityRecord(java.lang.String collationName, java.lang.String characterSetName) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

		setValue(0, collationName);
		setValue(1, characterSetName);
	}
}
