package com.bridgelabz.bridgelabz_demo.HelloWorld.service;

import com.bridgelabz.bridgelabz_demo.HelloWorld.dto.HelloWorldDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class HelloWorldService {
    public String nameMessage(HelloWorldDTO helloWorldDTO) {
        return "Hello " + helloWorldDTO.getFirstName() + " " + helloWorldDTO.getLastName() + " from BridgeLabz";
    }

    public String nameShow(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
