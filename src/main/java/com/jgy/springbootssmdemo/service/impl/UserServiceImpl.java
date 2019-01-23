package com.jgy.springbootssmdemo.service.impl;

import com.jgy.springbootssmdemo.model.User;
import com.jgy.springbootssmdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private User userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
