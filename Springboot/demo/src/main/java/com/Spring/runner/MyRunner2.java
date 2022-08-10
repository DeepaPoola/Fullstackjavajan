package com.Spring.runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Spring.beans.HelloBean;
import com.Spring.beans.Test;


//@Component
public class MyRunner2 implements CommandLineRunner{
    
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello, Good Evening");
		
		
	}

}
