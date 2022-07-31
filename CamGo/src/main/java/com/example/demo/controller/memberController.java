package com.example.demo.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class memberController {

    @RequestMapping("/withdrawal")
    public String withdrawal(){

        return "/member/withdrawal";
    }
}
