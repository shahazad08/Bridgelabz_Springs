package com.bridgelabz.bridgelabz_demo.MVCDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MVCDemoRestController {
    @GetMapping("/")
    public String index() {
        return "Hello from Brisgelabz";
    }
}
