package com.jgy.springbootssmdemo.mapper;

import com.jgy.springbootssmdemo.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}