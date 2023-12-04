package com.example.intujinternassignment.repo;

import com.example.intujinternassignment.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.CannotCreateTransactionException;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
