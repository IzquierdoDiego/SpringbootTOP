package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        if (1==1 ){
            System.out.println("233322");
            System.out.println("233322");

        }
        return "Hello wor323ld!";
    }

    @GetMapping("/casa")
    public String sayHello2(){
        if (1==1 ){
            System.out.println("233322");
            System.out.println("233322");

        }
        return "Hello casa!";
    }
}
