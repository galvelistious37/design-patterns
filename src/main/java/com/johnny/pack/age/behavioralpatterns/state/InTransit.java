package com.johnny.pack.age.behavioralpatterns.state;

public class InTransit implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway for transaction rollback");
        return 20;
    }

    @Override
    public void handlePayment() {
        throw new IllegalStateException("Already paid. Cannot pay again");
    }

    @Override
    public void handleDispatch() {
        System.out.println("Items in transit");
    }
}
