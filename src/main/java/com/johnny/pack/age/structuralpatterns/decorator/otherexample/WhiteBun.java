package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class WhiteBun extends Bun{

    private Burger burger;

    public WhiteBun(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", White Bun";
    }

    @Override
    public double cost() {
        return burger.cost() + 0;
    }
}
