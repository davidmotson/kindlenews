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
public class InnodbTrxRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.InnodbTrxRecord> {

	private static final long serialVersionUID = 2142890100;

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_id</code>.
	 */
	public void setTrxId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_id</code>.
	 */
	public java.lang.String getTrxId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_state</code>.
	 */
	public void setTrxState(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_state</code>.
	 */
	public java.lang.String getTrxState() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_started</code>.
	 */
	public void setTrxStarted(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_started</code>.
	 */
	public java.sql.Timestamp getTrxStarted() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
	 */
	public void setTrxRequestedLockId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
	 */
	public java.lang.String getTrxRequestedLockId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
	 */
	public void setTrxWaitStarted(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_wait_started</code>.
	 */
	public java.sql.Timestamp getTrxWaitStarted() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_weight</code>.
	 */
	public void setTrxWeight(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_weight</code>.
	 */
	public org.jooq.types.ULong getTrxWeight() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
	 */
	public void setTrxMysqlThreadId(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
	 */
	public org.jooq.types.ULong getTrxMysqlThreadId() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_query</code>.
	 */
	public void setTrxQuery(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_query</code>.
	 */
	public java.lang.String getTrxQuery() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
	 */
	public void setTrxOperationState(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_operation_state</code>.
	 */
	public java.lang.String getTrxOperationState() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
	 */
	public void setTrxTablesInUse(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
	 */
	public org.jooq.types.ULong getTrxTablesInUse() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
	 */
	public void setTrxTablesLocked(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
	 */
	public org.jooq.types.ULong getTrxTablesLocked() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
	 */
	public void setTrxLockStructs(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
	 */
	public org.jooq.types.ULong getTrxLockStructs() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
	 */
	public void setTrxLockMemoryBytes(org.jooq.types.ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
	 */
	public org.jooq.types.ULong getTrxLockMemoryBytes() {
		return (org.jooq.types.ULong) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
	 */
	public void setTrxRowsLocked(org.jooq.types.ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
	 */
	public org.jooq.types.ULong getTrxRowsLocked() {
		return (org.jooq.types.ULong) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
	 */
	public void setTrxRowsModified(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
	 */
	public org.jooq.types.ULong getTrxRowsModified() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
	 */
	public void setTrxConcurrencyTickets(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
	 */
	public org.jooq.types.ULong getTrxConcurrencyTickets() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
	 */
	public void setTrxIsolationLevel(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
	 */
	public java.lang.String getTrxIsolationLevel() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
	 */
	public void setTrxUniqueChecks(java.lang.Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
	 */
	public java.lang.Integer getTrxUniqueChecks() {
		return (java.lang.Integer) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
	 */
	public void setTrxForeignKeyChecks(java.lang.Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
	 */
	public java.lang.Integer getTrxForeignKeyChecks() {
		return (java.lang.Integer) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
	 */
	public void setTrxLastForeignKeyError(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
	 */
	public java.lang.String getTrxLastForeignKeyError() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_latched</code>.
	 */
	public void setTrxAdaptiveHashLatched(java.lang.Integer value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_latched</code>.
	 */
	public java.lang.Integer getTrxAdaptiveHashLatched() {
		return (java.lang.Integer) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_timeout</code>.
	 */
	public void setTrxAdaptiveHashTimeout(org.jooq.types.ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_adaptive_hash_timeout</code>.
	 */
	public org.jooq.types.ULong getTrxAdaptiveHashTimeout() {
		return (org.jooq.types.ULong) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
	 */
	public void setTrxIsReadOnly(java.lang.Integer value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
	 */
	public java.lang.Integer getTrxIsReadOnly() {
		return (java.lang.Integer) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
	 */
	public void setTrxAutocommitNonLocking(java.lang.Integer value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
	 */
	public java.lang.Integer getTrxAutocommitNonLocking() {
		return (java.lang.Integer) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbTrxRecord
	 */
	public InnodbTrxRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbTrx.INNODB_TRX);
	}

	/**
	 * Create a detached, initialised InnodbTrxRecord
	 */
	public InnodbTrxRecord(java.lang.String trxId, java.lang.String trxState, java.sql.Timestamp trxStarted, java.lang.String trxRequestedLockId, java.sql.Timestamp trxWaitStarted, org.jooq.types.ULong trxWeight, org.jooq.types.ULong trxMysqlThreadId, java.lang.String trxQuery, java.lang.String trxOperationState, org.jooq.types.ULong trxTablesInUse, org.jooq.types.ULong trxTablesLocked, org.jooq.types.ULong trxLockStructs, org.jooq.types.ULong trxLockMemoryBytes, org.jooq.types.ULong trxRowsLocked, org.jooq.types.ULong trxRowsModified, org.jooq.types.ULong trxConcurrencyTickets, java.lang.String trxIsolationLevel, java.lang.Integer trxUniqueChecks, java.lang.Integer trxForeignKeyChecks, java.lang.String trxLastForeignKeyError, java.lang.Integer trxAdaptiveHashLatched, org.jooq.types.ULong trxAdaptiveHashTimeout, java.lang.Integer trxIsReadOnly, java.lang.Integer trxAutocommitNonLocking) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.InnodbTrx.INNODB_TRX);

		setValue(0, trxId);
		setValue(1, trxState);
		setValue(2, trxStarted);
		setValue(3, trxRequestedLockId);
		setValue(4, trxWaitStarted);
		setValue(5, trxWeight);
		setValue(6, trxMysqlThreadId);
		setValue(7, trxQuery);
		setValue(8, trxOperationState);
		setValue(9, trxTablesInUse);
		setValue(10, trxTablesLocked);
		setValue(11, trxLockStructs);
		setValue(12, trxLockMemoryBytes);
		setValue(13, trxRowsLocked);
		setValue(14, trxRowsModified);
		setValue(15, trxConcurrencyTickets);
		setValue(16, trxIsolationLevel);
		setValue(17, trxUniqueChecks);
		setValue(18, trxForeignKeyChecks);
		setValue(19, trxLastForeignKeyError);
		setValue(20, trxAdaptiveHashLatched);
		setValue(21, trxAdaptiveHashTimeout);
		setValue(22, trxIsReadOnly);
		setValue(23, trxAutocommitNonLocking);
	}
}
