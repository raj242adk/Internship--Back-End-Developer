package com.example.intujinternassignment.service;

import com.example.intujinternassignment.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {

    public List<Blog> getAllBlogs();
    public Optional<Blog> getAllBlogById(Integer id);


    public Blog saveBlog(Blog blog);

    public Blog updateBlog(Integer id,Blog updateBlog);
}
