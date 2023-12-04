package com.example.intujinternassignment.controller;

import com.example.intujinternassignment.entity.Blog;
import com.example.intujinternassignment.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private BlogService blogService;

    @GetMapping("/blog/getall")
    public List<Blog> getAll(){
        return blogService.getAllBlogs();
    }
    @GetMapping("/blog/getById/{id}")
    public Optional<Blog> getAllById(@PathVariable Integer id){
        return blogService.getAllBlogById(id);
    }
    @PostMapping("/blog/save")
    public Blog saveBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }
    @PutMapping("/blog/update/{id}")
    public Blog updateBlog(@PathVariable Integer id,@RequestBody Blog updateBlog){
        return blogService.updateBlog(id,updateBlog);
    }
}
