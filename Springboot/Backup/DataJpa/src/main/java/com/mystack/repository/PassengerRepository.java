package com.mystack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystack.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
