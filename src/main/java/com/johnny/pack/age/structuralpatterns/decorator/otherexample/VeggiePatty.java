package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class VeggiePatty extends Burger {

    public VeggiePatty() {
        description = "Veggie Patty";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
