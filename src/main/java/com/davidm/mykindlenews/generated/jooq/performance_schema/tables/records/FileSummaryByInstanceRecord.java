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
public class FileSummaryByInstanceRecord extends org.jooq.impl.TableRecordImpl<com.davidm.mykindlenews.generated.jooq.performance_schema.tables.records.FileSummaryByInstanceRecord> {

	private static final long serialVersionUID = -1994489730;

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
	 */
	public void setFileName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
	 */
	public java.lang.String getFileName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
	 */
	public void setEventName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
	 */
	public java.lang.String getEventName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(org.jooq.types.ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public org.jooq.types.ULong getObjectInstanceBegin() {
		return (org.jooq.types.ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
	 */
	public void setCountStar(org.jooq.types.ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
	 */
	public org.jooq.types.ULong getCountStar() {
		return (org.jooq.types.ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(org.jooq.types.ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getSumTimerWait() {
		return (org.jooq.types.ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(org.jooq.types.ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMinTimerWait() {
		return (org.jooq.types.ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(org.jooq.types.ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWait() {
		return (org.jooq.types.ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(org.jooq.types.ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWait() {
		return (org.jooq.types.ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
	 */
	public void setCountRead(org.jooq.types.ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
	 */
	public org.jooq.types.ULong getCountRead() {
		return (org.jooq.types.ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(org.jooq.types.ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getSumTimerRead() {
		return (org.jooq.types.ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(org.jooq.types.ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getMinTimerRead() {
		return (org.jooq.types.ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(org.jooq.types.ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getAvgTimerRead() {
		return (org.jooq.types.ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(org.jooq.types.ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
	 */
	public org.jooq.types.ULong getMaxTimerRead() {
		return (org.jooq.types.ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public void setSumNumberOfBytesRead(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public java.lang.Long getSumNumberOfBytesRead() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
	 */
	public void setCountWrite(org.jooq.types.ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
	 */
	public org.jooq.types.ULong getCountWrite() {
		return (org.jooq.types.ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(org.jooq.types.ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getSumTimerWrite() {
		return (org.jooq.types.ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(org.jooq.types.ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getMinTimerWrite() {
		return (org.jooq.types.ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(org.jooq.types.ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getAvgTimerWrite() {
		return (org.jooq.types.ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(org.jooq.types.ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
	 */
	public org.jooq.types.ULong getMaxTimerWrite() {
		return (org.jooq.types.ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public void setSumNumberOfBytesWrite(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public java.lang.Long getSumNumberOfBytesWrite() {
		return (java.lang.Long) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
	 */
	public void setCountMisc(org.jooq.types.ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
	 */
	public org.jooq.types.ULong getCountMisc() {
		return (org.jooq.types.ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
	 */
	public void setSumTimerMisc(org.jooq.types.ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
	 */
	public org.jooq.types.ULong getSumTimerMisc() {
		return (org.jooq.types.ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
	 */
	public void setMinTimerMisc(org.jooq.types.ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
	 */
	public org.jooq.types.ULong getMinTimerMisc() {
		return (org.jooq.types.ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
	 */
	public void setAvgTimerMisc(org.jooq.types.ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
	 */
	public org.jooq.types.ULong getAvgTimerMisc() {
		return (org.jooq.types.ULong) getValue(23);
	}

	/**
	 * Setter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
	 */
	public void setMaxTimerMisc(org.jooq.types.ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
	 */
	public org.jooq.types.ULong getMaxTimerMisc() {
		return (org.jooq.types.ULong) getValue(24);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FileSummaryByInstanceRecord
	 */
	public FileSummaryByInstanceRecord() {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE);
	}

	/**
	 * Create a detached, initialised FileSummaryByInstanceRecord
	 */
	public FileSummaryByInstanceRecord(java.lang.String fileName, java.lang.String eventName, org.jooq.types.ULong objectInstanceBegin, org.jooq.types.ULong countStar, org.jooq.types.ULong sumTimerWait, org.jooq.types.ULong minTimerWait, org.jooq.types.ULong avgTimerWait, org.jooq.types.ULong maxTimerWait, org.jooq.types.ULong countRead, org.jooq.types.ULong sumTimerRead, org.jooq.types.ULong minTimerRead, org.jooq.types.ULong avgTimerRead, org.jooq.types.ULong maxTimerRead, java.lang.Long sumNumberOfBytesRead, org.jooq.types.ULong countWrite, org.jooq.types.ULong sumTimerWrite, org.jooq.types.ULong minTimerWrite, org.jooq.types.ULong avgTimerWrite, org.jooq.types.ULong maxTimerWrite, java.lang.Long sumNumberOfBytesWrite, org.jooq.types.ULong countMisc, org.jooq.types.ULong sumTimerMisc, org.jooq.types.ULong minTimerMisc, org.jooq.types.ULong avgTimerMisc, org.jooq.types.ULong maxTimerMisc) {
		super(com.davidm.mykindlenews.generated.jooq.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE);

		setValue(0, fileName);
		setValue(1, eventName);
		setValue(2, objectInstanceBegin);
		setValue(3, countStar);
		setValue(4, sumTimerWait);
		setValue(5, minTimerWait);
		setValue(6, avgTimerWait);
		setValue(7, maxTimerWait);
		setValue(8, countRead);
		setValue(9, sumTimerRead);
		setValue(10, minTimerRead);
		setValue(11, avgTimerRead);
		setValue(12, maxTimerRead);
		setValue(13, sumNumberOfBytesRead);
		setValue(14, countWrite);
		setValue(15, sumTimerWrite);
		setValue(16, minTimerWrite);
		setValue(17, avgTimerWrite);
		setValue(18, maxTimerWrite);
		setValue(19, sumNumberOfBytesWrite);
		setValue(20, countMisc);
		setValue(21, sumTimerMisc);
		setValue(22, minTimerMisc);
		setValue(23, avgTimerMisc);
		setValue(24, maxTimerMisc);
	}
}