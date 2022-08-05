package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class memberController {

  @RequestMapping("/withdrawal")
  public String withdrawal() {
    return "/member/withdrawal";
  }

  @RequestMapping("/join")
  public String join() {
    return "/member/join";
  }

  @RequestMapping("/joininfo")
  public String join_info() {
    return "/member/join_info";
  }

  @RequestMapping("/myInfo")
  public String join_info() {
    return "/member/myInfo";
  }
}
