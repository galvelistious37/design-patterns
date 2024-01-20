package com.johnny.pack.age.behavioralpatterns.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver price = new PriceObserver();
        QuantityObserver quantity = new QuantityObserver();
        order.attach(price);
        order.attach(quantity);

        order.addItem(50);
        System.out.println(order);
        order.addItem(180);
        order.addItem(180);
        order.addItem(180);
        order.addItem(180);
        order.addItem(180);
        System.out.println(order);
    }
}
