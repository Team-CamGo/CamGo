package com.example.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class campingController {

  @RequestMapping("/campinglist")
  public String withdrawal() {
    return "/camping/campingList.html";
  }
}
