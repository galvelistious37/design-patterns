package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class ChickenPatty extends Burger{

    public ChickenPatty() {
        description = "Chicken Patty";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
