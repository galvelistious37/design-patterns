package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class BeefPatty extends Burger{

    public BeefPatty() {
        description = "Beef Patty";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
