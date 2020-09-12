package com.radha.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SecurityController {

    @GetMapping(value="/")
    public String hello(){
        return "Hello";
    }

    @GetMapping(value="/user")
    public String user(){
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        System.out.println(" authentication :"+authentication);
        User principal = (User) authentication.getPrincipal();
        System.out.println("Principal :"+principal.toString());
        System.out.println("User Name:" +principal.getUsername());
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        authorities.stream().forEach(smt -> System.out.println(smt));
        System.out.println(authentication.getCredentials());
        return "Hello "+principal.getUsername();
    }

    @GetMapping(value="/admin")
    public String admin(){
        return "Hello admin";
    }


}
