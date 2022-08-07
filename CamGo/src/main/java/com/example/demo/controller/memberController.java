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

<<<<<<< HEAD
  @RequestMapping("/myInfo")
  public String myIfno() {
    return "/member/myInfo";
=======
  @RequestMapping("/login")
  public String login() {
    return "/member/login";
  }

  @RequestMapping("/findId")
  public String findId() {
    return "/member/findId";
  }

  @RequestMapping("/findPw")
  public String findPw() {
    return "/member/findPw";
>>>>>>> f2f9ce3d7bf2627c716e602a616c12743d651145
  }
}
