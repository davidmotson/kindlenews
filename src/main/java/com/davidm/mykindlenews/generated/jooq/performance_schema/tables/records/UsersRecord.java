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
public class UsersRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.UsersRecord> implements org.jooq.Record3<java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -4074074;

	/**
	 * Setter for <code>performance_schema.users.USER</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.users.USER</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
	 */
	public void setCurrentConnections(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
	 */
	public java.lang.Long getCurrentConnections() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
	 */
	public void setTotalConnections(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
	 */
	public java.lang.Long getTotalConnections() {
		return (java.lang.Long) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Users.USERS.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Users.USERS.CURRENT_CONNECTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Users.USERS.TOTAL_CONNECTIONS;
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
	public java.lang.Long value2() {
		return getCurrentConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getTotalConnections();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value1(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value2(java.lang.Long value) {
		setCurrentConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord value3(java.lang.Long value) {
		setTotalConnections(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UsersRecord values(java.lang.String value1, java.lang.Long value2, java.lang.Long value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UsersRecord
	 */
	public UsersRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Users.USERS);
	}

	/**
	 * Create a detached, initialised UsersRecord
	 */
	public UsersRecord(java.lang.String user, java.lang.Long currentConnections, java.lang.Long totalConnections) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.Users.USERS);

		setValue(0, user);
		setValue(1, currentConnections);
		setValue(2, totalConnections);
	}
}