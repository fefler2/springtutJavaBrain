package com.example.demo.Others;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OthersClass {
    @RequestMapping("/abc")
    public String s2(){
        return "S";
    }

    @RequestMapping("mn")
     private String s3(){
        return "af";
    }

    @RequestMapping("/b")
    private int b(){
        return 4;
    }



}
