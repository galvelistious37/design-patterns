package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public abstract class Burger {

    String description = "Mystery Meat";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
