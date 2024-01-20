package com.johnny.pack.age.behavioralpatterns.observer;

public class QuantityObserver  implements OrderObserver{
    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if(count <= 5){
            order.setShippingCost(20);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
    }
}
