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
public class AccountsRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.AccountsRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 1926110875;

	/**
	 * Setter for <code>performance_schema.accounts.USER</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.accounts.USER</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.accounts.HOST</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.accounts.HOST</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.accounts.CURRENT_CONNECTIONS</code>.
	 */
	public void setCurrentConnections(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.accounts.CURRENT_CONNECTIONS</code>.
	 */
	public java.lang.Long getCurrentConnections() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.accounts.TOTAL_CONNECTIONS</code>.
	 */
	public void setTotalConnections(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.accounts.TOTAL_CONNECTIONS</code>.
	 */
	public java.lang.Long getTotalConnections() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS.CURRENT_CONNECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS.TOTAL_CONNECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getCurrentConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getTotalConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountsRecord value1(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountsRecord value2(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountsRecord value3(java.lang.Long value) {
		setCurrentConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountsRecord value4(java.lang.Long value) {
		setTotalConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountsRecord values(java.lang.String value1, java.lang.String value2, java.lang.Long value3, java.lang.Long value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountsRecord
	 */
	public AccountsRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS);
	}

	/**
	 * Create a detached, initialised AccountsRecord
	 */
	public AccountsRecord(java.lang.String user, java.lang.String host, java.lang.Long currentConnections, java.lang.Long totalConnections) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Accounts.ACCOUNTS);

		setValue(0, user);
		setValue(1, host);
		setValue(2, currentConnections);
		setValue(3, totalConnections);
	}
}
