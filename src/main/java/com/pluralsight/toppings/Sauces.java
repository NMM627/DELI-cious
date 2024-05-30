package com.pluralsight.toppings;

public class Sauces extends Toppings {

    public Sauces(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice(int sandwichSize) {
        int fourInch = 1;
        int eightInch = 2;
        int twelveInch = 3;

        if (sandwichSize == fourInch) {
            return 0;
        }
        if (sandwichSize == eightInch) {
            return 0;
        }
        if (sandwichSize == twelveInch) {
            return 0;
        }

        return 0;
    }

}
