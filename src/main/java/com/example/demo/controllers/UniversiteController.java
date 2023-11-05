package com.example.demo.controllers;

import com.example.demo.IService.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("universites")
public class UniversiteController {
    IUniversiteService universiteService;

}
