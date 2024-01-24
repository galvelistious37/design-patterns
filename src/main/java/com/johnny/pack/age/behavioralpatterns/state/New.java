package com.johnny.pack.age.behavioralpatterns.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It's a new order. No processing done");
        return 0;
    }

    @Override
    public void handlePayment() {
        System.out.println("Payment received");
    }

    @Override
    public void handleDispatch() {
        System.out.println("Payment must be received first");
    }
}
