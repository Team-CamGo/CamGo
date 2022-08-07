package com.example.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

  @RequestMapping("/notice")
  public String notice() {
    return "/board/notice";
  }

  @RequestMapping("/modify")
  public String modify() {
    return "/board/modify";
  }

  @RequestMapping("/write")
  public String write() {
    return "/board/write";
  }

  @RequestMapping("/answer")
  public String answer() {
    return "/board/answer";
  }
}
