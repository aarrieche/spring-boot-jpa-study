package com.aarriechespring.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aarriechespring.spring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
