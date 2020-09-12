package com.radha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String home(){
        return "Welcome !....";
    }

    @GetMapping("/user")
    public String user(){
        return "Welcome User!....";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome Admin!....";
    }

}
