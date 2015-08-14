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
public class TableIoWaitsSummaryByIndexUsageRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord> {

	private static final long serialVersionUID = 484266488;

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
	 */
	public void setObjectType(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
	 */
	public java.lang.String getObjectType() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
	 */
	public java.lang.String getObjectSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
	 */
	public void setObjectName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
	 */
	public java.lang.String getObjectName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
	 */
	public void setIndexName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
	 */
	public java.lang.String getIndexName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
	 */
	public void setCountStar(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
	 */
	public org.jooq.types.ULong getCountStar() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getSumTimerWait() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMinTimerWait() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWait() {
		return (org.jooq.types.ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWait() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
	 */
	public void setCountRead(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
	 */
	public org.jooq.types.ULong getCountRead() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getSumTimerRead() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getMinTimerRead() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(org.jooq.types.ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getAvgTimerRead() {
		return (org.jooq.types.ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(org.jooq.types.ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getMaxTimerRead() {
		return (org.jooq.types.ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
	 */
	public void setCountWrite(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
	 */
	public org.jooq.types.ULong getCountWrite() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getSumTimerWrite() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(org.jooq.types.ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getMinTimerWrite() {
		return (org.jooq.types.ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(org.jooq.types.ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWrite() {
		return (org.jooq.types.ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(org.jooq.types.ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWrite() {
		return (org.jooq.types.ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
	 */
	public void setCountFetch(org.jooq.types.ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
	 */
	public org.jooq.types.ULong getCountFetch() {
		return (org.jooq.types.ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
	 */
	public void setSumTimerFetch(org.jooq.types.ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
	 */
	public org.jooq.types.ULong getSumTimerFetch() {
		return (org.jooq.types.ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
	 */
	public void setMinTimerFetch(org.jooq.types.ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
	 */
	public org.jooq.types.ULong getMinTimerFetch() {
		return (org.jooq.types.ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
	 */
	public void setAvgTimerFetch(org.jooq.types.ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
	 */
	public org.jooq.types.ULong getAvgTimerFetch() {
		return (org.jooq.types.ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
	 */
	public void setMaxTimerFetch(org.jooq.types.ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
	 */
	public org.jooq.types.ULong getMaxTimerFetch() {
		return (org.jooq.types.ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
	 */
	public void setCountInsert(org.jooq.types.ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
	 */
	public org.jooq.types.ULong getCountInsert() {
		return (org.jooq.types.ULong) getValue(24);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
	 */
	public void setSumTimerInsert(org.jooq.types.ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
	 */
	public org.jooq.types.ULong getSumTimerInsert() {
		return (org.jooq.types.ULong) getValue(25);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
	 */
	public void setMinTimerInsert(org.jooq.types.ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
	 */
	public org.jooq.types.ULong getMinTimerInsert() {
		return (org.jooq.types.ULong) getValue(26);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
	 */
	public void setAvgTimerInsert(org.jooq.types.ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerInsert() {
		return (org.jooq.types.ULong) getValue(27);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
	 */
	public void setMaxTimerInsert(org.jooq.types.ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerInsert() {
		return (org.jooq.types.ULong) getValue(28);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
	 */
	public void setCountUpdate(org.jooq.types.ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
	 */
	public org.jooq.types.ULong getCountUpdate() {
		return (org.jooq.types.ULong) getValue(29);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
	 */
	public void setSumTimerUpdate(org.jooq.types.ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
	 */
	public org.jooq.types.ULong getSumTimerUpdate() {
		return (org.jooq.types.ULong) getValue(30);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
	 */
	public void setMinTimerUpdate(org.jooq.types.ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
	 */
	public org.jooq.types.ULong getMinTimerUpdate() {
		return (org.jooq.types.ULong) getValue(31);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
	 */
	public void setAvgTimerUpdate(org.jooq.types.ULong value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
	 */
	public org.jooq.types.ULong getAvgTimerUpdate() {
		return (org.jooq.types.ULong) getValue(32);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
	 */
	public void setMaxTimerUpdate(org.jooq.types.ULong value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
	 */
	public org.jooq.types.ULong getMaxTimerUpdate() {
		return (org.jooq.types.ULong) getValue(33);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
	 */
	public void setCountDelete(org.jooq.types.ULong value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
	 */
	public org.jooq.types.ULong getCountDelete() {
		return (org.jooq.types.ULong) getValue(34);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
	 */
	public void setSumTimerDelete(org.jooq.types.ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
	 */
	public org.jooq.types.ULong getSumTimerDelete() {
		return (org.jooq.types.ULong) getValue(35);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
	 */
	public void setMinTimerDelete(org.jooq.types.ULong value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
	 */
	public org.jooq.types.ULong getMinTimerDelete() {
		return (org.jooq.types.ULong) getValue(36);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
	 */
	public void setAvgTimerDelete(org.jooq.types.ULong value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
	 */
	public org.jooq.types.ULong getAvgTimerDelete() {
		return (org.jooq.types.ULong) getValue(37);
	}

	/**
	 * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
	 */
	public void setMaxTimerDelete(org.jooq.types.ULong value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
	 */
	public org.jooq.types.ULong getMaxTimerDelete() {
		return (org.jooq.types.ULong) getValue(38);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TableIoWaitsSummaryByIndexUsageRecord
	 */
	public TableIoWaitsSummaryByIndexUsageRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
	}

	/**
	 * Create a detached, initialised TableIoWaitsSummaryByIndexUsageRecord
	 */
	public TableIoWaitsSummaryByIndexUsageRecord(java.lang.String objectType, java.lang.String objectSchema, java.lang.String objectName, java.lang.String indexName, org.jooq.types.ULong countStar, org.jooq.types.ULong sumTimerWait, org.jooq.types.ULong minTimerWait, org.jooq.types.ULong avgTimerWait, org.jooq.types.ULong maxTimerWait, org.jooq.types.ULong countRead, org.jooq.types.ULong sumTimerRead, org.jooq.types.ULong minTimerRead, org.jooq.types.ULong avgTimerRead, org.jooq.types.ULong maxTimerRead, org.jooq.types.ULong countWrite, org.jooq.types.ULong sumTimerWrite, org.jooq.types.ULong minTimerWrite, org.jooq.types.ULong avgTimerWrite, org.jooq.types.ULong maxTimerWrite, org.jooq.types.ULong countFetch, org.jooq.types.ULong sumTimerFetch, org.jooq.types.ULong minTimerFetch, org.jooq.types.ULong avgTimerFetch, org.jooq.types.ULong maxTimerFetch, org.jooq.types.ULong countInsert, org.jooq.types.ULong sumTimerInsert, org.jooq.types.ULong minTimerInsert, org.jooq.types.ULong avgTimerInsert, org.jooq.types.ULong maxTimerInsert, org.jooq.types.ULong countUpdate, org.jooq.types.ULong sumTimerUpdate, org.jooq.types.ULong minTimerUpdate, org.jooq.types.ULong avgTimerUpdate, org.jooq.types.ULong maxTimerUpdate, org.jooq.types.ULong countDelete, org.jooq.types.ULong sumTimerDelete, org.jooq.types.ULong minTimerDelete, org.jooq.types.ULong avgTimerDelete, org.jooq.types.ULong maxTimerDelete) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);

		setValue(0, objectType);
		setValue(1, objectSchema);
		setValue(2, objectName);
		setValue(3, indexName);
		setValue(4, countStar);
		setValue(5, sumTimerWait);
		setValue(6, minTimerWait);
		setValue(7, avgTimerWait);
		setValue(8, maxTimerWait);
		setValue(9, countRead);
		setValue(10, sumTimerRead);
		setValue(11, minTimerRead);
		setValue(12, avgTimerRead);
		setValue(13, maxTimerRead);
		setValue(14, countWrite);
		setValue(15, sumTimerWrite);
		setValue(16, minTimerWrite);
		setValue(17, avgTimerWrite);
		setValue(18, maxTimerWrite);
		setValue(19, countFetch);
		setValue(20, sumTimerFetch);
		setValue(21, minTimerFetch);
		setValue(22, avgTimerFetch);
		setValue(23, maxTimerFetch);
		setValue(24, countInsert);
		setValue(25, sumTimerInsert);
		setValue(26, minTimerInsert);
		setValue(27, avgTimerInsert);
		setValue(28, maxTimerInsert);
		setValue(29, countUpdate);
		setValue(30, sumTimerUpdate);
		setValue(31, minTimerUpdate);
		setValue(32, avgTimerUpdate);
		setValue(33, maxTimerUpdate);
		setValue(34, countDelete);
		setValue(35, sumTimerDelete);
		setValue(36, minTimerDelete);
		setValue(37, avgTimerDelete);
		setValue(38, maxTimerDelete);
	}
}