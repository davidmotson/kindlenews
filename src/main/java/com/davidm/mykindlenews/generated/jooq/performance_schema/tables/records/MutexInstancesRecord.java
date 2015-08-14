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
public class MutexInstancesRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.MutexInstancesRecord> implements org.jooq.Record3<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong> {

	private static final long serialVersionUID = 658575602;

	/**
	 * Setter for <code>performance_schema.mutex_instances.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.mutex_instances.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.mutex_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(org.jooq.types.ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.mutex_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public org.jooq.types.ULong getObjectInstanceBegin() {
		return (org.jooq.types.ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.mutex_instances.LOCKED_BY_THREAD_ID</code>.
	 */
	public void setLockedByThreadId(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.mutex_instances.LOCKED_BY_THREAD_ID</code>.
	 */
	public org.jooq.types.ULong getLockedByThreadId() {
		return (org.jooq.types.ULong) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, org.jooq.types.ULong, org.jooq.types.ULong> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.MutexInstances.MUTEX_INSTANCES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.MutexInstances.MUTEX_INSTANCES.OBJECT_INSTANCE_BEGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.MutexInstances.MUTEX_INSTANCES.LOCKED_BY_THREAD_ID;
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
		return getLockedByThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MutexInstancesRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MutexInstancesRecord value2(org.jooq.types.ULong value) {
		setObjectInstanceBegin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MutexInstancesRecord value3(org.jooq.types.ULong value) {
		setLockedByThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MutexInstancesRecord values(java.lang.String value1, org.jooq.types.ULong value2, org.jooq.types.ULong value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MutexInstancesRecord
	 */
	public MutexInstancesRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.MutexInstances.MUTEX_INSTANCES);
	}

	/**
	 * Create a detached, initialised MutexInstancesRecord
	 */
	public MutexInstancesRecord(java.lang.String name, org.jooq.types.ULong objectInstanceBegin, org.jooq.types.ULong lockedByThreadId) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.MutexInstances.MUTEX_INSTANCES);

		setValue(0, name);
		setValue(1, objectInstanceBegin);
		setValue(2, lockedByThreadId);
	}
}
