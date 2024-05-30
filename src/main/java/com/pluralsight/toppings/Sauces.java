package com.pluralsight.toppings;

public class Sauces extends Toppings {

    public Sauces(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0;
    }


}
