package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class campingController {

    /*
     * 캠핑지 목록
     */
    @RequestMapping("/campingList")
    public String campingList() {
        return "/camping/campingList.html";
    }

    /*
     * 캠핑지 상세페이지
     */
    @RequestMapping("/campingDetail")
    public String campingDetail() {
        return "/camping/campingDetail.html";
    }

    /*
     * 캠핑지 예약페이지
     */
    @RequestMapping("/campingRsvtIns")
    public String campingRsvtIns() {
        return "/camping/campingRsvtIns.html";
    }

    /*
     * 예약정보 페이지
     */
    @RequestMapping("/rsvtDetail")
    public String rsvtDetail() {
        return "/camping/rsvtDetail.html";
    }

}
