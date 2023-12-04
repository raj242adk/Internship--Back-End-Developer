package com.example.intujinternassignment.service.impl;

import com.example.intujinternassignment.entity.Category;
import com.example.intujinternassignment.repo.CategoryRepo;
import com.example.intujinternassignment.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }
}
