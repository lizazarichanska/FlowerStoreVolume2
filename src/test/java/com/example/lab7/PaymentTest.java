package com.example.lab7;

import com.example.lab7.payments.CreditCardPaymentStrategy;
import com.example.lab7.payments.PayPalPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentTest {
    private PayPalPaymentStrategy PayPalPayment;
    private CreditCardPaymentStrategy CreditCardPayment;

    @BeforeEach
    public void init() {
        PayPalPayment = new PayPalPaymentStrategy();
        CreditCardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPayment() {
        Assertions.assertTrue(PayPalPayment.pay());
        Assertions.assertTrue(CreditCardPayment.pay());
    }
}
