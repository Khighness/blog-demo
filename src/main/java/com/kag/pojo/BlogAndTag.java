package com.kag.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: KHighness
 * @Date: 2020/6/20 11:04
 * @Description: 博客&类型关系实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogAndTag {

    private Long tagId;

    private Long blogId;
}
