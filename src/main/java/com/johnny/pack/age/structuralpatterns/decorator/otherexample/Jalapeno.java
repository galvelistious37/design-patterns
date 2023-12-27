package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class Jalapeno extends Topping {
    private Burger burger;

    public Jalapeno(Burger burger){
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + .45;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Jalapeno";
    }
}
