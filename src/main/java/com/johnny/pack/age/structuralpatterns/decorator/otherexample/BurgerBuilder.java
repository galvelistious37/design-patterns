package com.johnny.pack.age.structuralpatterns.decorator.otherexample;

import java.text.NumberFormat;

public class BurgerBuilder {

    public static void main(String[] args) {
        Burger beefBurger = new BeefPatty();
        beefBurger = new WhiteBun(beefBurger);
        beefBurger = new Jalapeno(beefBurger);
        beefBurger = new Jalapeno(beefBurger);
        beefBurger = new Cheese(beefBurger);
        beefBurger = new Bacon(beefBurger);
        showBurger(beefBurger);

        Burger chickenBurger = new ChickenPatty();
        chickenBurger = new WhiteBun(chickenBurger);
        chickenBurger = new Bacon(chickenBurger);
        showBurger(chickenBurger);

        Burger veggieBurger = new VeggiePatty();
        veggieBurger = new WheatBun(veggieBurger);
        veggieBurger = new Tomato(veggieBurger);
        veggieBurger = new Jalapeno(veggieBurger);
        veggieBurger = new Tomato(veggieBurger);
        veggieBurger = new Onion(veggieBurger);
        veggieBurger = new Jalapeno(veggieBurger);
        veggieBurger = new Onion(veggieBurger);
        showBurger(veggieBurger);
    }

    private static void showBurger(Burger burger){
        NumberFormat usCurrency = NumberFormat.getCurrencyInstance();
        System.out.println(burger.getDescription() + ": " +
                usCurrency.format(burger.cost()));
    }
}
