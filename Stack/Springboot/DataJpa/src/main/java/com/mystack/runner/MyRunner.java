package com.mystack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mystack.entity.Passenger;
import com.mystack.repository.PassengerRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	PassengerRepository passengerRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      Passenger p = new Passenger();
      p.setPassengerId(101);
      p.setFirstname("Sunny");
      p.setLastname("Nallapu");
      p.setEmailId("Sunny@gmail.com");
      
      passengerRepo.save(p);
	}

}
