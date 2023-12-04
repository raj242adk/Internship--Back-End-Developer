package com.example.intujinternassignment.repo;

import com.example.intujinternassignment.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog,Integer> {
}
