/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql.routines;

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
public class RdsSetGshCollector extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1071730511;

	/**
	 * The parameter <code>mysql.rds_set_gsh_collector.p_period</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_PERIOD = createParameter("p_period", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public RdsSetGshCollector() {
		super("rds_set_gsh_collector", com.davidm.mykindlenews.generated.jooq.mysql.Mysql.MYSQL);

		addInParameter(P_PERIOD);
	}

	/**
	 * Set the <code>p_period</code> parameter IN value to the routine
	 */
	public void setPPeriod(java.lang.Integer value) {
		setValue(com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetGshCollector.P_PERIOD, value);
	}
}
