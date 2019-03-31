package com.example.hello_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        System.out.println("hello get request from " +request.getRequestURI());
        Map map=new ConcurrentHashMap();
        return port+":hello";
    }

    @GetMapping("/helloWithName")
    public String hello1(@RequestParam  String name, HttpServletRequest request){
        System.out.println("hello1 get request from "+request.getRequestURI());
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
        return port+":Hello "+name;
    }

    @GetMapping("/helloWithNameAndAge")
    public String hello2(@RequestHeader String name , @RequestHeader Integer age){
        return port+":Hello "+name +",are you " +age.longValue()+" ?";
    }

    @PostMapping("/helloWithName")
    public String hello3(@RequestBody String name){
        return port+":Hello "+name;
    }
}
