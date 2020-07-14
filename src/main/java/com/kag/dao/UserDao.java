package com.kag.dao;

import com.kag.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: KHighness
 * @Date: 2020/6/20 16:25
 * @Description: 用户持久层
 */

@Mapper
@Repository
public interface UserDao {

    /**
     * 登录检查
     * @param username
     * @param password
     * @return
     */
    User queryByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
