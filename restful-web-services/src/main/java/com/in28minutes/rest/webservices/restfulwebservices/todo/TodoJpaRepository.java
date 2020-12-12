package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
	List<Todo> findByUsername(String username);
	List<Todo> findByUsernameAndDescription(String username, String description);
	List<Todo> findByDescriptionContainingIgnoreCase(String description);
} 
