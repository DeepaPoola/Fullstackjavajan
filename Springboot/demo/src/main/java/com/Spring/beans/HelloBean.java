package com.Spring.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
   public void sayHello() {
	   System.out.println("Hello Spring boot");
   }
}
