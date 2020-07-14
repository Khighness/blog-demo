package com.kag.dao;

import com.kag.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/20 16:28
 * @Description: 类型持久层
 */

@Mapper
@Repository
public interface TypeDao {

    /**
     *
     * @param type
     * @return
     */
    int saveType(Type type);

    /**
     * 根据ID获取类型
     * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 根据名称获取类型
     * @param name
     * @return
     */
    Type getTypeByName(String name);

    /**
     * 获取所有类型
     * @return
     */
    List<Type> getAllType();

    /**
     * 首页右侧展示type对应的博客数量
     * @return
     */
    List<Type> getBlogType();

    /**
     * 更新类型
     * @param type
     * @return
     */
    int updateType(Type type);

    /**
     * 删除类型
     * @param id
     * @return
     */
    int deleteType(Long id);

}
