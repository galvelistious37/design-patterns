package com.johnny.pack.age.behavioralpatterns.observer;

// Concrete observer
public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        double total = order.getTotal();
        if(total >= 500){
            order.setDiscount(20);
        } else if(total >= 200){
            order.setDiscount(10);
        }
    }
}
