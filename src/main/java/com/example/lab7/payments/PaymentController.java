package com.example.lab7.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RequestMapping("/api/v1/payment")
@RestController
public class PaymentController {
    @GetMapping
    public List<? extends Payment> getPayments() {
        return List.of(new PayPalPaymentStrategy());
    }
}
