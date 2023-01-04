package com.example.lab7.payments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayPalPaymentStrategy implements Payment {
    private final String name;
    private final String description;

    public PayPalPaymentStrategy() {
        name = "PayPal";
        description = "PayPal payment";
    }

    @Override
    public boolean pay() {
        System.out.println("Paid with PayPal");
        return true;
    }
}
