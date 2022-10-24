package com.example._3_1_1boot.services;

import com.example._3_1_1boot.dao.UserDao;
import com.example._3_1_1boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User saveUser (User user) {
        User userSave = userDao.save(user);
        return userSave;
    }

    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.findAll();
        return userList;
    }
}
