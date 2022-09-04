package com.example.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

  /*
   * 공지사항 리스트
   */
  @RequestMapping("/notice")
  public String notice() {
    return "/board/notice";
  }

  /*
   * 공지사항 수정
   */
  @RequestMapping("/modify")
  public String modify() {
    return "/board/modify";
  }

  /*
   * 공지사항 작성
   */
  @RequestMapping("/write")
  public String write() {
    return "/board/write";
  }

  /*
   * 공지사항 문의
   */
  @RequestMapping("/answer")
  public String answer() {
    return "/board/answer";
  }
}
