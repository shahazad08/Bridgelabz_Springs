package com.bridgelabz.bridgelabz_demo.HelloWorld.controller;

import com.bridgelabz.bridgelabz_demo.HelloWorld.dto.HelloWorldDTO;
import com.bridgelabz.bridgelabz_demo.HelloWorld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/hello")
    public String message() {
        return "Hello from BridgeLabz";
    }


    @GetMapping("/helloname")
    public String messageWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hellomessage")
    public String messageDisplay(@RequestBody HelloWorldDTO helloWorldDTO) {
        return helloWorldService.nameMessage(helloWorldDTO);
    }

    @PutMapping("/hellomessagedisplay/{firstName}")
    public String helloMessage(@PathVariable String firstName, @RequestParam String lastName) {
        return helloWorldService.nameShow(firstName, lastName);
    }



}
