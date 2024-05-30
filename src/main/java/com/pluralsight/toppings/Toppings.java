package com.pluralsight.toppings;

public abstract class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice(int sandwichSize);

}

