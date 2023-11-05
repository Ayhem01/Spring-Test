package com.example.demo.controllers;

import com.example.demo.IService.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("chambres")
public class ChambreController {
    IChambreService chambreService;
}
