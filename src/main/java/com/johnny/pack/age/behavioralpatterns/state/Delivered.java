package com.johnny.pack.age.behavioralpatterns.state;

public class Delivered implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pickup");
        System.out.println("Payment roll back will be initiated upon receiving returned item");
        return 30;
    }

    @Override
    public void handlePayment() {
        throw new IllegalStateException("Already paid. Cannot pay again");
    }

    @Override
    public void handleDispatch() {
        System.out.println("Items delivered");
    }

}
