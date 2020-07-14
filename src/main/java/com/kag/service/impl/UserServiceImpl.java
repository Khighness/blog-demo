package com.kag.service.impl;

import com.kag.dao.UserDao;
import com.kag.pojo.User;
import com.kag.service.UserService;
import com.kag.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: KHighness
 * @Date: 2020/6/21 18:44
 * @Description: 用户服务层实现
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.queryByUsernameAndPassword(username, MD5Utils.string2MD5(password));
        return user;
    }
}
