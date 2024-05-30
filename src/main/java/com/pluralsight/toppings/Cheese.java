package com.pluralsight.toppings;

public class Cheese extends PremiumTopping {
    public Cheese(String name, double getPrice) {
        super(name, getPrice);
    }

    @Override
    public double getPrice(int sandwichSize) {
        int fourInch = 1;
        int eightInch = 2;
        int twelveInch = 3;

        if (sandwichSize == fourInch) {
            return .75;
        }
        if (sandwichSize == eightInch) {
            return 1.50;
        }
        if (sandwichSize == twelveInch) {
            return 2.25;
        }

        return 0;
    }



}
