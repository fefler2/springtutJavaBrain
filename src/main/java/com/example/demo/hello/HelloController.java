package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // domyslnie mapuje do get
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
