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
public class InnodbFtBeingDeletedRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbFtBeingDeletedRecord> implements org.jooq.Record1<org.jooq.types.ULong> {

	private static final long serialVersionUID = -301924458;

	/**
	 * Setter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	public void setDocId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_BEING_DELETED.DOC_ID</code>.
	 */
	public org.jooq.types.ULong getDocId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<org.jooq.types.ULong> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<org.jooq.types.ULong> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED.DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value1() {
		return getDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtBeingDeletedRecord value1(org.jooq.types.ULong value) {
		setDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtBeingDeletedRecord values(org.jooq.types.ULong value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbFtBeingDeletedRecord
	 */
	public InnodbFtBeingDeletedRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);
	}

	/**
	 * Create a detached, initialised InnodbFtBeingDeletedRecord
	 */
	public InnodbFtBeingDeletedRecord(org.jooq.types.ULong docId) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED);

		setValue(0, docId);
	}
}
