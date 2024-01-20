package com.johnny.pack.age.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// A Concrete Subject
public class Order {
    private String id;
    private double shippingCost;
    private double itemCost;
    private double discount;
    private int count;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id){
        this.id = id;
    }

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    public void addItem(double price){
        itemCost += price;
        count++;
        observers.forEach(o -> o.updated(this));
    }

    public double getTotal(){
        return itemCost - discount + shippingCost;
    }

    public double getItemCost(){
        return itemCost;
    }

    public int getCount(){
        return count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public List<OrderObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<OrderObserver> observers) {
        this.observers = observers;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", shippingCost=" + shippingCost +
                ", itemCost=" + itemCost +
                ", discount=" + discount +
                ", count=" + count +
                ", observers=" + observers +
                '}';
    }
}
