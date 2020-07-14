package com.kag.service;

import com.kag.pojo.Type;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/21 16:17
 * @Description: 类型服务层
 */

public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    List<Type> getAllType();

    List<Type> getBlogType();  //首页右侧展示type对应的博客数量

    int updateType(Type type);

    int deleteType(Long id);
}
