package com.example.demo.controllers;

import com.example.demo.IService.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("reservations")
public class ReservationController {
    IReservationService reservationService;
}
