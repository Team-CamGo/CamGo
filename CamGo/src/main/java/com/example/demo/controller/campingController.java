package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class campingController {

    /*
     * 캠핑지 목록
     */
    @RequestMapping("/campinglist")
    public String campingList() {
        return "/camping/campingList.html";
    }

    /*
     * 캠핑지 상세페이지
     */
    @RequestMapping("/campingdetail")
    public String campingDetail() {
        return "/camping/campingDetail.html";
    }

}
