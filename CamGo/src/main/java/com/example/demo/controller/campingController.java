package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class campingController {

    /*
     * TEST
     */
//    @GetMapping("/campingWrite")
//    public String campingWriteTest() {
//        return "/camping/campingWrite.html";
//    }

//    @PostMapping("/camping/campingWriteIns")
//    public String campingWriteIns(Product product) {
//        
//        System.out.println(product.getName());
//        
//        return "";
//    }

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
