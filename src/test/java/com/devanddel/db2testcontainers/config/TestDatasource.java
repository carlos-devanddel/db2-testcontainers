package com.devanddel.db2testcontainers.config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestDatasource extends DriverManagerDataSource {
	private DB2Container db;

	public TestDatasource() {
		super();
	}

	@PostConstruct
	public void init() {
		setDriverClassName("com.ibm.db2.jcc.DB2Driver");
		db = DB2Container.getInstance();
		db.setDatasource(this);
		db.start();
	}
}