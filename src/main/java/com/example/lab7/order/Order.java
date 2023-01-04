package com.example.lab7.order;

import com.example.lab7.delivery.Delivery;
import com.example.lab7.flower.Item;
import com.example.lab7.payments.Payment;
import com.example.lab7.user.AppUser;
import lombok.Setter;
import java.util.LinkedList;

public class Order {
    private LinkedList<AppUser>  users = new LinkedList<>();

    private LinkedList<Item> items = new LinkedList<>();
    @Setter
    private Payment payment;
    @Setter
    private Delivery delivery;

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item:
             items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (payment.pay()) {
            delivery.deliver();
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(AppUser user) {
        users.add(user);
    }

    public void removeUser(AppUser user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (AppUser user: users) {
            user.update();
        }
    }
}
