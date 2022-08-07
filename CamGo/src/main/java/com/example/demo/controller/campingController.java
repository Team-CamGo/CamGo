package com.example.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class campingController {

<<<<<<< HEAD
  @RequestMapping("/campinglist")
  public String withdrawal() {
    return "/camping/campingList.html";
  }
=======
    @RequestMapping("/campinglist")
    public String campingList(){

        return "/camping/campingList.html";
    }
>>>>>>> f2f9ce3d7bf2627c716e602a616c12743d651145
}
