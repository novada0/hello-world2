package com.example.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/lab14")
  public String hello(){
    return "Hello World!";
  }
}
