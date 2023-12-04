package com.example.intujinternassignment.controller;

import com.example.intujinternassignment.entity.Category;
import com.example.intujinternassignment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @PostMapping("/catogory_save")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);

    }
}
