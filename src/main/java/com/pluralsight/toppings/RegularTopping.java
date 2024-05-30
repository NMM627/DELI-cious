package com.pluralsight.toppings;

public class RegularTopping extends Toppings {
    public RegularTopping(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice(int sandwichSize) {
       return 0;
    }
}
