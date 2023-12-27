package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class Cheese extends Topping{
    private Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + .10;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }
}
