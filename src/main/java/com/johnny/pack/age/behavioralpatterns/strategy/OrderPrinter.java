package com.johnny.pack.age.behavioralpatterns.strategy;

import java.util.Collection;

// Strategy interface
public interface OrderPrinter {
    void print(Collection<Order> orders);
}
