package com.example.lab7;

import com.example.lab7.flower.Flower;
import com.example.lab7.flower.decorators.BasketDecorator;
import com.example.lab7.flower.decorators.PaperDecorator;
import com.example.lab7.flower.decorators.RibbonDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorsTest {
    private Flower flower;
    private PaperDecorator paperDecorator;
    private BasketDecorator basketDecorator;
    private RibbonDecorator ribbonDecorator;

    @BeforeEach
    public void init() {
        flower = new Flower("blue", 100, 100);
        paperDecorator = new PaperDecorator(flower);
        basketDecorator = new BasketDecorator(flower);
        ribbonDecorator = new RibbonDecorator(flower);
    }

    @Test
    public void testPayment() {
        Assertions.assertEquals(113, paperDecorator.getPrice());
        Assertions.assertEquals(104, basketDecorator.getPrice());
        Assertions.assertEquals(140, ribbonDecorator.getPrice());
    }
}

