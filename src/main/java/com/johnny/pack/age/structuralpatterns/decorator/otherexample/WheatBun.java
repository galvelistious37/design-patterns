package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

public class WheatBun extends Bun {
    private Burger burger;

    public WheatBun(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Wheat Bun";
    }

    @Override
    public double cost() {
        return burger.cost() + .15;
    }
}
