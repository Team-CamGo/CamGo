package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {

  /*
   * 회원가입 - 정보 동의
   */
  @RequestMapping("/join")
  public String join() {
    return "/member/join";
  }

  /*
   * 회원가입 - 정보 입력
   */
  @RequestMapping("/joininfo")
  public String join_info() {
    return "/member/joinInfo";
  }

  /*
   * 마이페이지 - 회원
   */
  @RequestMapping("/myInfo")
  public String myInfo() {
    return "/member/myInfo";
  }

  /*
   * 마이페이지 - 회원 - 예약내역조회
   */
  @RequestMapping("/reservation")
  public String reservation() {
    return "/member/reservation";
  }

  /*
   * 마이페이지 - 회원 - 결제내역조회
   */
  @RequestMapping("/buyProduct")
  public String buy_product() {
    return "/member/buyProduct";
  }

  // 페이지 추가 필요
  /*
   * 마이페이지 - 회원 - 1:1문의
   */

  /*
   * 마이페이지 - 회원 - 리뷰내역조회
   */

  /*
   * 마이페이지 - 회원 - 좋아요
   */
  @RequestMapping("/like")
  public String like_camping() {
    return "/member/likeCamping";
  }

  /*
   * 회원탈퇴
   */
  @RequestMapping("/withdrawal")
  public String withdrawal() {
    return "/member/withdrawal";
  }

  /*
   * 로그인
   */
  @RequestMapping("/login")
  public String login() {
    return "/member/login";
  }

  /*
   * 아이디 찾기
   */
  @RequestMapping("/findId")
  public String findId() {
    return "/member/findId";
  }

  /*
   * 비밀번호 찾기
   */
  @RequestMapping("/findPw")
  public String findPw() {
    return "/member/findPw";
  }

  /*
   * 핸드폰 인증
   */
  @RequestMapping("/findPhone")
  public String findPhone() {
    return "/member/findPhone";
  }

  /*
   * 이메일 인증
   */
  @RequestMapping("/findEmail")
  public String findEmail() {
    return "/member/findEmail";
  }

  /*
   * 리뷰 작성 페이지
   */
  @RequestMapping("/review")
  public String review() {
    return "/member/review";
  }

  /*
   * 문의글 작성 페이지
   */
  @RequestMapping("/inquiry")
  public String inquiry() {
    return "/member/inquiry";
  }

  /*
   * 사업자 회원 - 캠핑지 관리
   */
  @RequestMapping("/bCamping")
  public String bCamping() {
    return "/member/businessCamping";
  }

  /*
   * 사업자 회원 - 예약 관리
   */
  @RequestMapping("/bReservation")
  public String bReservation() {
    return "/member/businessReservation";
  }
}
