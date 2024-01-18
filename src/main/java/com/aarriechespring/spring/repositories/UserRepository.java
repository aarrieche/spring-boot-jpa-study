package com.aarriechespring.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aarriechespring.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
