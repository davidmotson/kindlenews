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
public class ThreadsRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.ThreadsRecord> implements org.jooq.Record14<org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented> {

	private static final long serialVersionUID = 199511247;

	/**
	 * Setter for <code>performance_schema.threads.THREAD_ID</code>.
	 */
	public void setThreadId(org.jooq.types.ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.THREAD_ID</code>.
	 */
	public org.jooq.types.ULong getThreadId() {
		return (org.jooq.types.ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.threads.NAME</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.NAME</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.threads.TYPE</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.TYPE</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_ID</code>.
	 */
	public void setProcesslistId(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_ID</code>.
	 */
	public org.jooq.types.ULong getProcesslistId() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_USER</code>.
	 */
	public void setProcesslistUser(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_USER</code>.
	 */
	public java.lang.String getProcesslistUser() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_HOST</code>.
	 */
	public void setProcesslistHost(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_HOST</code>.
	 */
	public java.lang.String getProcesslistHost() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_DB</code>.
	 */
	public void setProcesslistDb(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_DB</code>.
	 */
	public java.lang.String getProcesslistDb() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
	 */
	public void setProcesslistCommand(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
	 */
	public java.lang.String getProcesslistCommand() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_TIME</code>.
	 */
	public void setProcesslistTime(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_TIME</code>.
	 */
	public java.lang.Long getProcesslistTime() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_STATE</code>.
	 */
	public void setProcesslistState(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_STATE</code>.
	 */
	public java.lang.String getProcesslistState() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.threads.PROCESSLIST_INFO</code>.
	 */
	public void setProcesslistInfo(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PROCESSLIST_INFO</code>.
	 */
	public java.lang.String getProcesslistInfo() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.threads.PARENT_THREAD_ID</code>.
	 */
	public void setParentThreadId(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.PARENT_THREAD_ID</code>.
	 */
	public org.jooq.types.ULong getParentThreadId() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.threads.ROLE</code>.
	 */
	public void setRole(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.ROLE</code>.
	 */
	public java.lang.String getRole() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.threads.INSTRUMENTED</code>.
	 */
	public void setInstrumented(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.threads.INSTRUMENTED</code>.
	 */
	public com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented getInstrumented() {
		return (com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<org.jooq.types.ULong, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, org.jooq.types.ULong, java.lang.String, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_COMMAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PROCESSLIST_INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field12() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.PARENT_THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented> field14() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS.INSTRUMENTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value1() {
		return getThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getProcesslistId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getProcesslistUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getProcesslistHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getProcesslistDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getProcesslistCommand();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getProcesslistTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getProcesslistState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getProcesslistInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value12() {
		return getParentThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented value14() {
		return getInstrumented();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value1(org.jooq.types.ULong value) {
		setThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value3(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value4(org.jooq.types.ULong value) {
		setProcesslistId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value5(java.lang.String value) {
		setProcesslistUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value6(java.lang.String value) {
		setProcesslistHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value7(java.lang.String value) {
		setProcesslistDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value8(java.lang.String value) {
		setProcesslistCommand(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value9(java.lang.Long value) {
		setProcesslistTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value10(java.lang.String value) {
		setProcesslistState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value11(java.lang.String value) {
		setProcesslistInfo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value12(org.jooq.types.ULong value) {
		setParentThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value13(java.lang.String value) {
		setRole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord value14(com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented value) {
		setInstrumented(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ThreadsRecord values(org.jooq.types.ULong value1, java.lang.String value2, java.lang.String value3, org.jooq.types.ULong value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.Long value9, java.lang.String value10, java.lang.String value11, org.jooq.types.ULong value12, java.lang.String value13, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ThreadsRecord
	 */
	public ThreadsRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS);
	}

	/**
	 * Create a detached, initialised ThreadsRecord
	 */
	public ThreadsRecord(org.jooq.types.ULong threadId, java.lang.String name, java.lang.String type, org.jooq.types.ULong processlistId, java.lang.String processlistUser, java.lang.String processlistHost, java.lang.String processlistDb, java.lang.String processlistCommand, java.lang.Long processlistTime, java.lang.String processlistState, java.lang.String processlistInfo, org.jooq.types.ULong parentThreadId, java.lang.String role, com.davidm.mykindlenews.generated.jooq.performance_schema.enums.ThreadsInstrumented instrumented) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Threads.THREADS);

		setValue(0, threadId);
		setValue(1, name);
		setValue(2, type);
		setValue(3, processlistId);
		setValue(4, processlistUser);
		setValue(5, processlistHost);
		setValue(6, processlistDb);
		setValue(7, processlistCommand);
		setValue(8, processlistTime);
		setValue(9, processlistState);
		setValue(10, processlistInfo);
		setValue(11, parentThreadId);
		setValue(12, role);
		setValue(13, instrumented);
	}
}
