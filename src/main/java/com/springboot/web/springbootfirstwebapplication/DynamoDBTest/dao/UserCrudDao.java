package com.springboot.web.springbootfirstwebapplication.DynamoDBTest.dao;

import org.springframework.stereotype.Component;

import com.springboot.web.springbootfirstwebapplication.DynamoDBTest.pojo.User;

@Component
public interface UserCrudDao {

	 public User createUser(User user);
	 
	 public User readUser(String userId);
	 
	 public User updateUser(User user);
	 
	 public void deleteUser(String userId);
}
