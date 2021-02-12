package com.springboot.web.springbootfirstwebapplication.DynamoDBTest.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springboot.web.springbootfirstwebapplication.DynamoDBTest.dao.UserCrudDao;
import com.springboot.web.springbootfirstwebapplication.DynamoDBTest.pojo.User;
import com.springboot.web.springbootfirstwebapplication.DynamoDBTest.service.UserCrudService;

@Component
public class UserCrudServiceImpl implements UserCrudService {

	@Autowired
    private UserCrudDao userCrudDao;

    
    public UserCrudServiceImpl(UserCrudDao userCrudDao) {
        this.userCrudDao = userCrudDao;
    }

    @Override
    public User createUser(User user) {
        return userCrudDao.createUser(user);
    }

    @Override
    public User readUser(String userId) {
        return userCrudDao.readUser(userId);
    }

    @Override
    public User updateUser(User user) {
        return userCrudDao.updateUser(user);
    }

    @Override
    public void deleteUser(String userId) {
        userCrudDao.deleteUser(userId);
    }
}
