package com.cartpro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartpro.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//findBy + fieldName
    Optional<User> findByUsername(String username);
}
