package com.kag.service;

import com.kag.pojo.Tag;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/21 16:17
 * @Description: 标签服务层
 */

public interface TagService {

    int saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    List<Tag> getAllTag();

    List<Tag> getBlogTag();  //首页展示博客标签

    List<Tag> getTagByString(String text);   //从字符串中获取tag集合

    int updateTag(Tag tag);

    int deleteTag(Long id);
}
