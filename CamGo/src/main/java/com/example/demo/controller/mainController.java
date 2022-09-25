package com.example.demo.controller;

// import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    /*
     * mainIndex
     */
    @RequestMapping({ "", "/", "index" })
    public String mainIndex() {
        return "/index.html";
    }

}
