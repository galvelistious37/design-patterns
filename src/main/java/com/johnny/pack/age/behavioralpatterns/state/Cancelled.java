package com.johnny.pack.age.behavioralpatterns.state;

public class Cancelled implements OrderState{
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Can't cancel anymore");
    }

    @Override
    public void handlePayment() {
        throw new IllegalStateException("Already paid. Cannot pay again");
    }

    @Override
    public void handleDispatch() {
        System.out.println("Items already delivered");
    }
}
