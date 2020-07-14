package com.kag.service;

import com.kag.pojo.User;

/**
 * @Author: KHighness
 * @Date: 2020/6/21 16:20
 * @Description: 用户服务层
 */

public interface UserService {

    public User checkUser(String username, String password);
}
