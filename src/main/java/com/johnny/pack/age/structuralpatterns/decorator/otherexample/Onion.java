package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class Onion extends Topping{
    private Burger burger;

    public Onion(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + .49;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Onion";
    }
}
