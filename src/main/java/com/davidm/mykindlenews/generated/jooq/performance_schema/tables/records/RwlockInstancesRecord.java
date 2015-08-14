/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records;

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
public class RwlockInstancesRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.RwlockInstancesRecord> implements org.jooq.Record4<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger> {

	private static final long serialVersionUID = 654888247;

	/**
	 * Setter for <code>performance_schema.rwlock_instances.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.rwlock_instances.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public org.jooq.types.ULong getObjectInstanceBegin() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
	 */
	public void setWriteLockedByThreadId(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
	 */
	public org.jooq.types.ULong getWriteLockedByThreadId() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
	 */
	public void setReadLockedByCount(org.jooq.types.UInteger value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
	 */
	public org.jooq.types.UInteger getReadLockedByCount() {
		return (org.jooq.types.UInteger) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong, org.jooq.types.UInteger> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES.OBJECT_INSTANCE_BEGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES.WRITE_LOCKED_BY_THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field4() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES.READ_LOCKED_BY_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value2() {
		return getObjectInstanceBegin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value3() {
		return getWriteLockedByThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value4() {
		return getReadLockedByCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RwlockInstancesRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RwlockInstancesRecord value2(org.jooq.types.ULong value) {
		setObjectInstanceBegin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RwlockInstancesRecord value3(org.jooq.types.ULong value) {
		setWriteLockedByThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RwlockInstancesRecord value4(org.jooq.types.UInteger value) {
		setReadLockedByCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RwlockInstancesRecord values(java.lang.String value1, org.jooq.types.ULong value2, org.jooq.types.ULong value3, org.jooq.types.UInteger value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RwlockInstancesRecord
	 */
	public RwlockInstancesRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES);
	}

	/**
	 * Create a detached, initialised RwlockInstancesRecord
	 */
	public RwlockInstancesRecord(java.lang.String name, org.jooq.types.ULong objectInstanceBegin, org.jooq.types.ULong writeLockedByThreadId, org.jooq.types.UInteger readLockedByCount) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES);

		setValue(0, name);
		setValue(1, objectInstanceBegin);
		setValue(2, writeLockedByThreadId);
		setValue(3, readLockedByCount);
	}
}