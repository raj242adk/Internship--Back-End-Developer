package com.example.intujinternassignment.service.impl;

import com.example.intujinternassignment.entity.Blog;
import com.example.intujinternassignment.repo.BlogRepo;
import com.example.intujinternassignment.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepo blogRepo;
    @Override
    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    @Override
    public Optional<Blog> getAllBlogById(Integer id) {
        return blogRepo.findById(id);
    }




    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepo.save(blog);
    }

    @Override
    public Blog updateBlog(Integer id, Blog updateBlog) {
        if (blogRepo.existsById(id)){
            updateBlog.setId(id);
            return blogRepo.save(updateBlog);
        }
        return null;
    }
}
