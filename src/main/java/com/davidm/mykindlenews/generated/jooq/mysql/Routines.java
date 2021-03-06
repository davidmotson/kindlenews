/**
 * This class is generated by jOOQ
 */
package com.davidm.mykindlenews.generated.jooq.mysql;

/**
 * Convenience access to all stored procedures and functions in mysql
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.4"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>mysql.rds_collect_global_status_history</code>
	 */
	public static void rdsCollectGlobalStatusHistory(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsCollectGlobalStatusHistory p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsCollectGlobalStatusHistory();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_disable_gsh_collector</code>
	 */
	public static void rdsDisableGshCollector(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsDisableGshCollector p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsDisableGshCollector();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_disable_gsh_rotation</code>
	 */
	public static void rdsDisableGshRotation(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsDisableGshRotation p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsDisableGshRotation();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_enable_gsh_collector</code>
	 */
	public static void rdsEnableGshCollector(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsEnableGshCollector p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsEnableGshCollector();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_enable_gsh_rotation</code>
	 */
	public static void rdsEnableGshRotation(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsEnableGshRotation p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsEnableGshRotation();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_external_master</code>
	 */
	public static void rdsExternalMaster(org.jooq.Configuration configuration, java.lang.String phase) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsExternalMaster p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsExternalMaster();
		p.setPhase(phase);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_innodb_buffer_pool_dump_now</code>
	 */
	public static void rdsInnodbBufferPoolDumpNow(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolDumpNow p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolDumpNow();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_innodb_buffer_pool_load_abort</code>
	 */
	public static void rdsInnodbBufferPoolLoadAbort(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolLoadAbort p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolLoadAbort();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_innodb_buffer_pool_load_now</code>
	 */
	public static void rdsInnodbBufferPoolLoadNow(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolLoadNow p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsInnodbBufferPoolLoadNow();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_kill</code>
	 */
	public static void rdsKill(org.jooq.Configuration configuration, java.lang.Long thread) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsKill p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsKill();
		p.setThread(thread);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_kill_query</code>
	 */
	public static void rdsKillQuery(org.jooq.Configuration configuration, java.lang.Long thread) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsKillQuery p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsKillQuery();
		p.setThread(thread);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_next_master_log</code>
	 */
	public static void rdsNextMasterLog(org.jooq.Configuration configuration, java.lang.Integer currMasterLog) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsNextMasterLog p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsNextMasterLog();
		p.setCurrMasterLog(currMasterLog);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_reset_external_master</code>
	 */
	public static void rdsResetExternalMaster(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsResetExternalMaster p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsResetExternalMaster();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_rotate_general_log</code>
	 */
	public static void rdsRotateGeneralLog(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateGeneralLog p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateGeneralLog();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_rotate_global_status_history</code>
	 */
	public static void rdsRotateGlobalStatusHistory(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateGlobalStatusHistory p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateGlobalStatusHistory();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_rotate_slow_log</code>
	 */
	public static void rdsRotateSlowLog(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateSlowLog p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsRotateSlowLog();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_set_configuration</code>
	 */
	public static void rdsSetConfiguration(org.jooq.Configuration configuration, java.lang.String name, java.lang.Integer value) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetConfiguration p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetConfiguration();
		p.setName_(name);
		p.setValue(value);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_set_external_master</code>
	 */
	public static void rdsSetExternalMaster(org.jooq.Configuration configuration, java.lang.String host, java.lang.Integer port, java.lang.String user, java.lang.String passwd, java.lang.String name, java.lang.String pos, java.lang.Byte enableSslEncryption) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetExternalMaster();
		p.setHost(host);
		p.setPort(port);
		p.setUser(user);
		p.setPasswd(passwd);
		p.setName_(name);
		p.setPos(pos);
		p.setEnableSslEncryption(enableSslEncryption);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_set_gsh_collector</code>
	 */
	public static void rdsSetGshCollector(org.jooq.Configuration configuration, java.lang.Integer pPeriod) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetGshCollector p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetGshCollector();
		p.setPPeriod(pPeriod);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_set_gsh_rotation</code>
	 */
	public static void rdsSetGshRotation(org.jooq.Configuration configuration, java.lang.Integer pPeriod) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetGshRotation p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSetGshRotation();
		p.setPPeriod(pPeriod);

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_show_configuration</code>
	 */
	public static void rdsShowConfiguration(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsShowConfiguration p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsShowConfiguration();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_skip_repl_error</code>
	 */
	public static void rdsSkipReplError(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSkipReplError p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsSkipReplError();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_start_replication</code>
	 */
	public static void rdsStartReplication(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsStartReplication p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsStartReplication();

		p.execute(configuration);
	}

	/**
	 * Call <code>mysql.rds_stop_replication</code>
	 */
	public static void rdsStopReplication(org.jooq.Configuration configuration) {
		com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsStopReplication p = new com.davidm.mykindlenews.generated.jooq.mysql.routines.RdsStopReplication();

		p.execute(configuration);
	}
}
