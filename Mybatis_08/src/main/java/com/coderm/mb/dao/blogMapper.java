package com.coderm.mb.dao;

import com.coderm.mb.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface blogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);
}
