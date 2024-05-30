package com.pluralsight.toppings;

public abstract class PremiumTopping extends Toppings {
    public PremiumTopping(String name, double getPrice) {
        super(name, getPrice);
    }

    public abstract double getPrice(int sandwichSize);
}
