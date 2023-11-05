package com.example.demo.controllers;

import com.example.demo.IService.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("blocs")
public class BlocController {
    IBlocService blocService;
    @GetMapping("/test")
 public String test(){
    return "test";
}
}
