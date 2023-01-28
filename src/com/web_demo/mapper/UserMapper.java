package com.web_demo.mapper;

import com.web_demo.entity.User;

/**
 * 用户接口类
 */
public interface UserMapper {
    public User queryUserByName(String userName);
    public Integer insertUser(User user);
}
