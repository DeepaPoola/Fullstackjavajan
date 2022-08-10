package com.mystack.Bean;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
  public void sayHello() {
	  System.out.println("Welcome to Springboot");
  }
}
