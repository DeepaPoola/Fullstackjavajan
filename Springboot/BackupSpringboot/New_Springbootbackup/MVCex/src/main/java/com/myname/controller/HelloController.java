package com.myname.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  @GetMapping("/hello")
  public ModelAndView getMessage() {
	  return new ModelAndView("welcome");
  }
  @GetMapping("/info")
  public String getInfo(Model m) {
	  m.addAttribute("msg","Hello welcome"+new Date());
	  //m.addAttribute("msg","Hello welcome");
	  return "home";
  }
}
