package com.devanddel.db2testcontainers.daos;

import com.devanddel.db2testcontainers.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	private void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<User> getUsers() {

		return jdbcTemplate.query("SELECT ID, NAME FROM USERS", (rs, rowNum) -> new User(rs.getString("ID"), rs.getString("NAME")));
	}
}
