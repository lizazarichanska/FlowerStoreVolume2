package com.example.lab7;

import com.example.lab7.delivery.DHLDeliveryStrategy;
import com.example.lab7.delivery.PostDeliveryStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeliveryTest {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliveryStrategy DHLDelivery;

    @BeforeEach
    public void init() {
        postDelivery = new PostDeliveryStrategy();
        DHLDelivery = new DHLDeliveryStrategy();
    }

    @Test
    public void testDelivery() {
        Assertions.assertTrue(postDelivery.deliver());
        Assertions.assertTrue(DHLDelivery.deliver());
    }
}
