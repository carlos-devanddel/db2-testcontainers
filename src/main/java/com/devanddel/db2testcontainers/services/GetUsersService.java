package com.devanddel.db2testcontainers.services;

import com.devanddel.db2testcontainers.models.User;

import java.util.List;

public interface GetUsersService {
	List<User> getAllUsers();
}
