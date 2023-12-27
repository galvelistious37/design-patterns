package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class Bacon extends Topping{
    private Burger burger;

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + .99;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }
}
