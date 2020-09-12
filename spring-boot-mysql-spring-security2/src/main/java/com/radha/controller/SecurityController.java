package com.radha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping(value="/")
    public String hello(){
        return "Hello !....";
    }

    @GetMapping(value="/user")
    public String user(){
        return "Hello User!....";
    }

    @GetMapping(value="/admin")
    public String admin(){
        return "Hello Admin!....";
    }


}
