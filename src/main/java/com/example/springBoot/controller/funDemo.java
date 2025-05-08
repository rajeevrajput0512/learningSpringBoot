package com.example.springBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funDemo {
    @GetMapping("/")
    public String fun(){
        return "Chal gya okay b noasdhoiasdgifyj";
    }
    @GetMapping("/login")
    public String tgun(){
        return "Chal gya okay bhai ysss";
    }
}
