package com.aarriechespring.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aarriechespring.spring.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
