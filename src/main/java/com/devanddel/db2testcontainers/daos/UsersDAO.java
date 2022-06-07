package com.devanddel.db2testcontainers.daos;

import com.devanddel.db2testcontainers.models.User;

import java.util.List;

public interface UsersDAO {
	List<User> getUsers();
}
