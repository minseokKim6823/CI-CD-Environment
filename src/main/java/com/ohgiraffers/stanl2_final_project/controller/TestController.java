package com.ohgiraffers.stanl2_final_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String testCheck(){
        return "Jenkins 배포 입니다!";
    }

}
