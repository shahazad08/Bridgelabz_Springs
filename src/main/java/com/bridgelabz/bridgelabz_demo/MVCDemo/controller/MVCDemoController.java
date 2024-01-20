package com.bridgelabz.bridgelabz_demo.MVCDemo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCDemoController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping ("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        return "message";
    }
}
