package com.devanddel.db2testcontainers.services;

import com.devanddel.db2testcontainers.daos.UsersDAO;
import com.devanddel.db2testcontainers.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsersServiceImpl implements GetUsersService {

	@Autowired
	private UsersDAO usersDAO;

	@Override
	public List<User> getAllUsers() {
		return usersDAO.getUsers();
	}
}
