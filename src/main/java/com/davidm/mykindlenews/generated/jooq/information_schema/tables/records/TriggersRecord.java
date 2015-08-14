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
public class TriggersRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.information_schema.tables.records.TriggersRecord> implements org.jooq.Record22<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 374375167;

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	public void setTriggerCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	public java.lang.String getTriggerCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	public void setTriggerSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	public java.lang.String getTriggerSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
	 */
	public void setTriggerName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
	 */
	public java.lang.String getTriggerName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
	 */
	public void setEventManipulation(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
	 */
	public java.lang.String getEventManipulation() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
	 */
	public void setEventObjectCatalog(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
	 */
	public java.lang.String getEventObjectCatalog() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
	 */
	public void setEventObjectSchema(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
	 */
	public java.lang.String getEventObjectSchema() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
	 */
	public void setEventObjectTable(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
	 */
	public java.lang.String getEventObjectTable() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
	 */
	public void setActionOrder(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
	 */
	public java.lang.Long getActionOrder() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
	 */
	public void setActionCondition(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
	 */
	public java.lang.String getActionCondition() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
	 */
	public void setActionStatement(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
	 */
	public java.lang.String getActionStatement() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
	 */
	public void setActionOrientation(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
	 */
	public java.lang.String getActionOrientation() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
	 */
	public void setActionTiming(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
	 */
	public java.lang.String getActionTiming() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
	 */
	public void setActionReferenceOldTable(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
	 */
	public java.lang.String getActionReferenceOldTable() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
	 */
	public void setActionReferenceNewTable(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
	 */
	public java.lang.String getActionReferenceNewTable() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
	 */
	public void setActionReferenceOldRow(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
	 */
	public java.lang.String getActionReferenceOldRow() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
	 */
	public void setActionReferenceNewRow(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
	 */
	public java.lang.String getActionReferenceNewRow() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.CREATED</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.CREATED</code>.
	 */
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
	 */
	public void setSqlMode(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.SQL_MODE</code>.
	 */
	public java.lang.String getSqlMode() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.DEFINER</code>.
	 */
	public void setDefiner(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.DEFINER</code>.
	 */
	public java.lang.String getDefiner() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
	 */
	public void setCharacterSetClient(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
	 */
	public java.lang.String getCharacterSetClient() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
	 */
	public void setCollationConnection(java.lang.String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
	 */
	public java.lang.String getCollationConnection() {
		return (java.lang.String) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
	 */
	public void setDatabaseCollation(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
	 */
	public java.lang.String getDatabaseCollation() {
		return (java.lang.String) getValue(21);
	}

	// -------------------------------------------------------------------------
	// Record22 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row22) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row22<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row22) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.TRIGGER_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.TRIGGER_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.TRIGGER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.EVENT_MANIPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.EVENT_OBJECT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.EVENT_OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.EVENT_OBJECT_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_CONDITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_STATEMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_ORIENTATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_TIMING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_REFERENCE_OLD_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_REFERENCE_NEW_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_REFERENCE_OLD_ROW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.ACTION_REFERENCE_NEW_ROW;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field17() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.SQL_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field19() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.DEFINER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field20() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.CHARACTER_SET_CLIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field21() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.COLLATION_CONNECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field22() {
		return com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS.DATABASE_COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTriggerCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTriggerSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTriggerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEventManipulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEventObjectCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getEventObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getEventObjectTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getActionOrder();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getActionCondition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getActionStatement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getActionOrientation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getActionTiming();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getActionReferenceOldTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getActionReferenceNewTable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getActionReferenceOldRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getActionReferenceNewRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value17() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getSqlMode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value19() {
		return getDefiner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value20() {
		return getCharacterSetClient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value21() {
		return getCollationConnection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value22() {
		return getDatabaseCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value1(java.lang.String value) {
		setTriggerCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value2(java.lang.String value) {
		setTriggerSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value3(java.lang.String value) {
		setTriggerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value4(java.lang.String value) {
		setEventManipulation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value5(java.lang.String value) {
		setEventObjectCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value6(java.lang.String value) {
		setEventObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value7(java.lang.String value) {
		setEventObjectTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value8(java.lang.Long value) {
		setActionOrder(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value9(java.lang.String value) {
		setActionCondition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value10(java.lang.String value) {
		setActionStatement(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value11(java.lang.String value) {
		setActionOrientation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value12(java.lang.String value) {
		setActionTiming(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value13(java.lang.String value) {
		setActionReferenceOldTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value14(java.lang.String value) {
		setActionReferenceNewTable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value15(java.lang.String value) {
		setActionReferenceOldRow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value16(java.lang.String value) {
		setActionReferenceNewRow(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value17(java.sql.Timestamp value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value18(java.lang.String value) {
		setSqlMode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value19(java.lang.String value) {
		setDefiner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value20(java.lang.String value) {
		setCharacterSetClient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value21(java.lang.String value) {
		setCollationConnection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord value22(java.lang.String value) {
		setDatabaseCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TriggersRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Long value8, java.lang.String value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.lang.String value14, java.lang.String value15, java.lang.String value16, java.sql.Timestamp value17, java.lang.String value18, java.lang.String value19, java.lang.String value20, java.lang.String value21, java.lang.String value22) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TriggersRecord
	 */
	public TriggersRecord() {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS);
	}

	/**
	 * Create a detached, initialised TriggersRecord
	 */
	public TriggersRecord(java.lang.String triggerCatalog, java.lang.String triggerSchema, java.lang.String triggerName, java.lang.String eventManipulation, java.lang.String eventObjectCatalog, java.lang.String eventObjectSchema, java.lang.String eventObjectTable, java.lang.Long actionOrder, java.lang.String actionCondition, java.lang.String actionStatement, java.lang.String actionOrientation, java.lang.String actionTiming, java.lang.String actionReferenceOldTable, java.lang.String actionReferenceNewTable, java.lang.String actionReferenceOldRow, java.lang.String actionReferenceNewRow, java.sql.Timestamp created, java.lang.String sqlMode, java.lang.String definer, java.lang.String characterSetClient, java.lang.String collationConnection, java.lang.String databaseCollation) {
		super(com.davidm.mykindlenews.generated.jooq.information_schema.tables.Triggers.TRIGGERS);

		setValue(0, triggerCatalog);
		setValue(1, triggerSchema);
		setValue(2, triggerName);
		setValue(3, eventManipulation);
		setValue(4, eventObjectCatalog);
		setValue(5, eventObjectSchema);
		setValue(6, eventObjectTable);
		setValue(7, actionOrder);
		setValue(8, actionCondition);
		setValue(9, actionStatement);
		setValue(10, actionOrientation);
		setValue(11, actionTiming);
		setValue(12, actionReferenceOldTable);
		setValue(13, actionReferenceNewTable);
		setValue(14, actionReferenceOldRow);
		setValue(15, actionReferenceNewRow);
		setValue(16, created);
		setValue(17, sqlMode);
		setValue(18, definer);
		setValue(19, characterSetClient);
		setValue(20, collationConnection);
		setValue(21, databaseCollation);
	}
}