package com.johnny.pack.age.behavioralpatterns.state;

// Context class
public class Order {
    private OrderState currentState;

    public Order(){
        currentState = new New();
    }

    public double cancel(){
        double charges = currentState.handleCancellation();
        currentState = new Cancelled();
        return charges;
    }

    public void paymentSuccessful(){
        currentState.handlePayment();
        currentState = new Paid();
    }

    public void dispatched(){
        currentState.handleDispatch();
        currentState = new InTransit();
    }

    public void delivered(){
       currentState = new Delivered();
    }
}
