package com.johnny.pack.age.behavioralpatterns.state;

// Abstract state
public interface OrderState {
    double handleCancellation();
    void handlePayment();
    void handleDispatch();
}
