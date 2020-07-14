package com.kag.dao;

import com.kag.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/20 16:26
 * @Description: 评论持久层
 */

@Mapper
@Repository
public interface CommentDao {

    /**
     * 添加一个评论
     * @param comment
     * @return
     */
    int saveComment(Comment comment);

    /**
     * 高内聚创建时间倒序来排序
     * @param blogId
     * @param BlogParentId
     * @return
     */
    List<Comment> findByBlogIdAndParentCommentNull(@Param("blogId") Long blogId, @Param("blogParetId") Long BlogParentId);

    /**
     * 查询父级对象
     * @param parentCommentId
     * @return
     */
    Comment findByParentCommentId(@Param("parentCommentId") Long parentCommentId);
}
