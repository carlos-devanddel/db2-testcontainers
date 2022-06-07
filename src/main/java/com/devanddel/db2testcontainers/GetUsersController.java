package com.devanddel.db2testcontainers;

import com.devanddel.db2testcontainers.models.User;
import com.devanddel.db2testcontainers.services.GetUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GetUsersController {

	@Autowired
	GetUsersService getUsersService;

	public List<User> allUsers() {
		return getUsersService.getAllUsers();
	}

}
