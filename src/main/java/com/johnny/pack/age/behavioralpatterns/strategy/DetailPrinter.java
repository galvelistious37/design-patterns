package com.johnny.pack.age.behavioralpatterns.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*********** Detail Report ***************");
        Iterator<Order> iterator = orders.iterator();
        double total = 0;
        for(int i = 1; iterator.hasNext(); i++){
            double orderTotal = 0;
            Order order = iterator.next();
            System.out.println("Index: " + i + " " +
                    order.getId() + " " +
                    order.getDate());
            for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
                orderTotal += entry.getValue();
            }
            System.out.println("--------------------------");
            System.out.println("Total: " + orderTotal);
            System.out.println("--------------------------");
            total += order.getTotal();
        }
        System.out.println("***************************************");
        System.out.println("Total: " + total);
    }
}
