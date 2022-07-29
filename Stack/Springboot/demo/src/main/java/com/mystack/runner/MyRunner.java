package com.mystack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mystack.Bean.HelloBean;
import com.mystack.Bean.Test;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	Test t;
	
	@Autowired
	HelloBean b;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		t.m1();
		t.m2();
		b.sayHello();
	}

}
