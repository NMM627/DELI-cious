package com.pluralsight.toppings;

public class Meat extends PremiumTopping {


    public Meat(String name, double getPrice) {
        super(name, getPrice);
    }

    @Override
    public double getPrice(int sandwichSize) {
        int fourInch = 1;
        int eightInch = 2;
        int twelveInch = 3;

        if (sandwichSize == fourInch) {
            return 1.00;
        }
        if (sandwichSize == eightInch) {
            return 2.00;
        }
        if (sandwichSize == twelveInch) {
            return 3.00;
        }

        return 0;
    }

}
