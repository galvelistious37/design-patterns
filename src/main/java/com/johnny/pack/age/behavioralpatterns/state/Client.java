package com.johnny.pack.age.behavioralpatterns.state;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.paymentSuccessful();
        order.cancel();

        System.out.println();

        Order order2 = new Order();
        order2.paymentSuccessful();
        order2.dispatched();
        order2.dispatched();
        order2.delivered();
        order2.cancel();
    }
}
