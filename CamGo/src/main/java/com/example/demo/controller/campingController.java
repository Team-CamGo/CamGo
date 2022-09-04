package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class campingController {

    @RequestMapping("/campinglist")
    public String campingList() {
        return "/camping/campingList.html";
    }

    @RequestMapping("/campingdetail")
    public String campingDetail() {
        return "/camping/campingDetail.html";
    }

    @RequestMapping("/campdetail")
    public String campDetail() {
        return "/camping/campDetail.html";
    }

}
