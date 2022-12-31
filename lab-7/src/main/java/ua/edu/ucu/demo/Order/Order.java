package ua.edu.ucu.demo.Order;

import lombok.Getter;
import ua.edu.ucu.demo.Delivery.Delivery;
import ua.edu.ucu.demo.Item;
import ua.edu.ucu.demo.Payment.Payment;
import ua.edu.ucu.demo.User.AppUsser;

import java.util.ArrayList;
import java.util.List;

public class Order {
    @Getter
    private List<Item> items = new ArrayList<>();

    @Getter
    private List<AppUsser> users = new ArrayList<>();
    @Getter
    private Payment payment = new Payment();
    @Getter
    private Delivery delivery = new Delivery();
    @Getter
    private boolean isProcessed = false;

    public void setPaymentStrategy(Payment payment){
        this.payment=payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double CalculateTotalPrice(){
        double price = 0;
        for (Item item : items){
            price+= item.price();
        }
        return price;
    }

    public void processOrder(){

        isProcessed = true;
        order();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public void addUser(AppUsser user){
        users.add(user);
    }

    public void removeUser(AppUsser user){
        users.remove(user);
    }

    public void notifyUsers(){
        for (AppUsser user : users){
            user.update("order is updated");
        }
    }


    public void order(){
        notifyUsers();
    }
}
