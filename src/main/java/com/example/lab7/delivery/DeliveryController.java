package com.example.lab7.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RequestMapping("/api/v1/delivery")
@RestController
public class DeliveryController {
    @GetMapping
    public List<? extends Delivery> getPayments() {
        return List.of(new DHLDeliveryStrategy());
    }
}
