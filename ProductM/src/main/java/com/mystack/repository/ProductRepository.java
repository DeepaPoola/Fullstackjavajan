package com.mystack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystack.model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}
