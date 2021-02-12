package com.springboot.web.springbootfirstwebapplication.DynamoDBTest.service;

import org.springframework.stereotype.Service;

import com.springboot.web.springbootfirstwebapplication.DynamoDBTest.pojo.User;

@Service
public interface UserCrudService {

	 public User createUser(User user);
	 
	 public User readUser(String userId);
	 
	 public User updateUser(User user);
	 
	 public void deleteUser(String userId);
	 
}
