package com.johnny.pack.age.behavioralpatterns.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }

    @Override
    public void handlePayment() {
        throw new IllegalStateException("Already paid. Cannot pay again");
    }

    @Override
    public void handleDispatch() {
        System.out.println("Shipping items");
    }
}
