package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {

  @RequestMapping("/noticeWrite")
  public String noticeWrite() {
    return "/admin/notice";
  }

  @RequestMapping("/adminInfo")
  public String adminInfo() {
    return "/member/adminInfo";
  }
}
