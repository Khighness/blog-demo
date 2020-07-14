package com.kag.service;

import com.kag.pojo.Comment;

import java.util.List;

/**
 * @Author: KHighness
 * @Date: 2020/6/21 16:16
 * @Description: 评论服务层
 */

public interface CommentService {

    List<Comment> getCommentByBlogId(Long blogId);

    int saveComment(Comment comment);
}
