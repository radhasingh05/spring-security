package com.radha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SecurityController {

    @GetMapping(value="/")
    public Map<Integer, String> home(){
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"home");
        return map;
    }

//    @GetMapping(value="/user")
//    public Map<Integer, String> user(){
//        Map<Integer,String> map = new HashMap<Integer, String>();
//        map.put(1,"user");
//        return map;
//    }
//
//    @GetMapping(value="/admin")
//    public Map<Integer, String> admin(){
//        Map<Integer,String> map = new HashMap<Integer, String>();
//        map.put(1,"admin");
//        return map;
//    }




}
