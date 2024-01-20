package com.aarriechespring.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aarriechespring.spring.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
