package com.kag.dao;

import com.kag.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/20 16:28
 * @Description: 标签持久层
 */

@Mapper
@Repository
public interface TagDao {

    /**
     * 保存标签
     * @param tag
     * @return
     */
    int saveTag(Tag tag);

    /**
     * 根据id获取标签
     * @param id
     * @return
     */
    Tag getTag(@Param("id") Long id);

    /**
     * 根据名称获取标签
     * @param name
     * @return
     */
    Tag getTagByName(@Param("name") String name);

    /**
     * 获取所有标签
     * @return
     */
    List<Tag> getAllTag();

    /**
     * 首页展示博客标签
     * @return
     */
    List<Tag> getBlogTag();

    /**
     * 更新标签
     * @param tag
     * @return
     */
    int updateTag(Tag tag);

    /**
     * 删除标签
     * @param id
     * @return
     */
    int deleteTag(@Param("id") Long id);
}
