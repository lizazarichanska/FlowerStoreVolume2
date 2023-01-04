package com.example.lab7.payments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardPaymentStrategy implements Payment {
    private final String name;
    private final String description;

    public CreditCardPaymentStrategy() {
        name = "Credit Card";
        description = "Credit Card payment";
    }

    @Override
    public boolean pay() {
        System.out.println("Paid with Credit Card");
        return true;
    }
}
