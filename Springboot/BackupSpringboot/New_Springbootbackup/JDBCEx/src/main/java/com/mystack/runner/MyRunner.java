package com.mystack.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mystack.dao.impl.TestDaoImpl;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	TestDaoImpl dao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Testcase 123");
		dao.insertRecords();
		List data=dao.selectRecords();
		data.forEach(d-> System.out.println(d));
	}
  
}
