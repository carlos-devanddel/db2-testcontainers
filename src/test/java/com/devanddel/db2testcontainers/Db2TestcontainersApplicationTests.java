package com.devanddel.db2testcontainers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Db2TestcontainersApplicationTests {

	@Autowired
	GetUsersController sut;

	@Test
	void contextLoads() {
	}

	@Test
	void getUsersReturnEmptyList() {
		Assert.assertEquals(0, sut.allUsers().size());
	}
}
