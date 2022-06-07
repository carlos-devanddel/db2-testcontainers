package com.devanddel.db2testcontainers.config;

import org.testcontainers.containers.Db2Container;

public class DB2Container extends Db2Container {

	private static final String IMAGE_VERSION = "ibmcom/db2:latest";
	private static DB2Container container;
	private static TestDatasource datasource;

	private DB2Container() {
		super(IMAGE_VERSION);
	}

	public static DB2Container getInstance() {
		if (container == null) {
			container = new DB2Container();
		}
		return container;
	}

	public void setDatasource(TestDatasource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void start() {
		container.acceptLicense();
		container.withInitScript("initialScript.sql");
		super.start();
		datasource.setUrl(container.getJdbcUrl());
		datasource.setUsername(container.getUsername());
		datasource.setPassword(container.getPassword());
	}

	@Override
	public void stop() {
		//do nothing, JVM handles shut down
	}

}
