package com.radha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @RequestMapping(value = "/")
    public String publicMethod(){
        return "Hi Everyone !...";
    }

    @RequestMapping(value = "/user")
    public String userMethod(){
        return "Hi User !...";
    }

    @RequestMapping(value = "/admin")
    public String adminMethod(){
        return "Hi Admin !...";
    }

}
