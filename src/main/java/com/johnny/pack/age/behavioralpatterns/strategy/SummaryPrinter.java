package com.johnny.pack.age.behavioralpatterns.strategy;

import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*********** Summary Report ***************");
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        for(int i = 1; iterator.hasNext(); i++){
            Order order = iterator.next();
            System.out.println("Index: " + i + " " +
                    order.getId() + " " +
                    order.getDate() + " " +
                    order.getItems().size() + " " +
                    order.getTotal());
            total += order.getTotal();
        }
        System.out.println("***************************************");
        System.out.println("Total: " + total);
    }
}
