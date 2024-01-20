package com.aarriechespring.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aarriechespring.spring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
