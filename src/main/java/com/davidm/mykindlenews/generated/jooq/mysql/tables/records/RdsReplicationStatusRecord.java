/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables.records;

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
public class RdsReplicationStatusRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.RdsReplicationStatusRecord> implements org.jooq.Record6<java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 618727509;

	/**
	 * Setter for <code>mysql.rds_replication_status.action_timestamp</code>.
	 */
	public void setActionTimestamp(java.sql.Timestamp value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.action_timestamp</code>.
	 */
	public java.sql.Timestamp getActionTimestamp() {
		return (java.sql.Timestamp) getValue(0);
	}

	/**
	 * Setter for <code>mysql.rds_replication_status.called_by_user</code>.
	 */
	public void setCalledByUser(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.called_by_user</code>.
	 */
	public java.lang.String getCalledByUser() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>mysql.rds_replication_status.action</code>.
	 */
	public void setAction(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.action</code>.
	 */
	public java.lang.String getAction() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>mysql.rds_replication_status.mysql_version</code>.
	 */
	public void setMysqlVersion(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.mysql_version</code>.
	 */
	public java.lang.String getMysqlVersion() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>mysql.rds_replication_status.master_host</code>.
	 */
	public void setMasterHost(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.master_host</code>.
	 */
	public java.lang.String getMasterHost() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>mysql.rds_replication_status.master_port</code>.
	 */
	public void setMasterPort(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>mysql.rds_replication_status.master_port</code>.
	 */
	public java.lang.Integer getMasterPort() {
		return (java.lang.Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field1() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.ACTION_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.CALLED_BY_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.ACTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.MYSQL_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.MASTER_HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS.MASTER_PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value1() {
		return getActionTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCalledByUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAction();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getMysqlVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getMasterHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getMasterPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value1(java.sql.Timestamp value) {
		setActionTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value2(java.lang.String value) {
		setCalledByUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value3(java.lang.String value) {
		setAction(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value4(java.lang.String value) {
		setMysqlVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value5(java.lang.String value) {
		setMasterHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord value6(java.lang.Integer value) {
		setMasterPort(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RdsReplicationStatusRecord values(java.sql.Timestamp value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RdsReplicationStatusRecord
	 */
	public RdsReplicationStatusRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS);
	}

	/**
	 * Create a detached, initialised RdsReplicationStatusRecord
	 */
	public RdsReplicationStatusRecord(java.sql.Timestamp actionTimestamp, java.lang.String calledByUser, java.lang.String action, java.lang.String mysqlVersion, java.lang.String masterHost, java.lang.Integer masterPort) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.RdsReplicationStatus.RDS_REPLICATION_STATUS);

		setValue(0, actionTimestamp);
		setValue(1, calledByUser);
		setValue(2, action);
		setValue(3, mysqlVersion);
		setValue(4, masterHost);
		setValue(5, masterPort);
	}
}
