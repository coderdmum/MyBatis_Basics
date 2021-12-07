package com.coderm.mb.dao;

import com.coderm.mb.pojo.Blog;
import com.coderm.mb.utils.IdUtils;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSqlSession();
        blogMapper mapper = session.getMapper(blogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.commit();
        session.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "Mybatis如此简单");
        List<Blog> blogList = blogMapper.queryBlogIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }


        sqlSession.close();
    }
}




























