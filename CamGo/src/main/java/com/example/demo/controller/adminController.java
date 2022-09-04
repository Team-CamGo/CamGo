package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
    /*
        공지사항리스트 페이지
    */
    @RequestMapping("/noticeWrite")
    public String noticeWrite() {
    return "/admin/notice";
    }

    /*
        사업자회원관리리스트 페이지
     */
    @RequestMapping("/adminInfo")
    public String adminInfo() {
    return "/admin/adminInfo";
    }

    /*
        캠핑지 관리리스트 페이지
     */
    @RequestMapping("/campingCare")
    public String campingCare() {
    return "/admin/campingCare.html";
    }

    /*
        캠핑지 옵션관리리스트 페이지
     */
    @RequestMapping("/campingOption")
    public String campingOption() {
    return "/admin/campingOption.html";
    }
}
