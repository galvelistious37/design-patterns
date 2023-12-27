package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class Tomato extends Topping{

    private Burger burger;

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() +.35;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }
}
