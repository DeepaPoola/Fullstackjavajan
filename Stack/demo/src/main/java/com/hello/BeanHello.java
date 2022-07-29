package com.hello;

import org.springframework.stereotype.Component;

@Component
public class BeanHello {
  public void sayHello() {
	  System.out.println("Bean class");
  }
}
