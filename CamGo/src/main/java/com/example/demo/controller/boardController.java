package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {
  /**
   * 리뷰 리스트
   */
  @RequestMapping("/reviewList")
  public String reviewList() {
    return "/board/reviewList";
  }

  /**
   * 리뷰 상세
   */
  @RequestMapping("/reviewDetail")
  public String reviewDetail() {
    return "/board/reviewDetail";
  }

    /**
   * 전산요청 리스트 페이지
   */
  @RequestMapping("/requestList")
  public String requestList() {
    return "/board/requestList";
  }

  /**
   * 전산요청 리스트 페이지
   */
  @RequestMapping("/requestDetail")
  public String request() {
    return "/board/requestDetail";
  }
}
