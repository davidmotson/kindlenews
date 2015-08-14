/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.tables.records;

/**
 * MySQL plugins
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PluginRecord extends org.jooq.impl.UpdatableRecordImpl<com.davidm.mykindlenews.generated.jooq.mysql.tables.records.PluginRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -333688507;

	/**
	 * Setter for <code>mysql.plugin.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>mysql.plugin.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>mysql.plugin.dl</code>.
	 */
	public void setDl(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>mysql.plugin.dl</code>.
	 */
	public java.lang.String getDl() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
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
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Plugin.PLUGIN.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.mysql.tables.Plugin.PLUGIN.DL;
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
	public java.lang.String value2() {
		return getDl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginRecord value2(java.lang.String value) {
		setDl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PluginRecord
	 */
	public PluginRecord() {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Plugin.PLUGIN);
	}

	/**
	 * Create a detached, initialised PluginRecord
	 */
	public PluginRecord(java.lang.String name, java.lang.String dl) {
		super(com.davidm.mykindlenews.generated.jooq.mysql.tables.Plugin.PLUGIN);

		setValue(0, name);
		setValue(1, dl);
	}
}
