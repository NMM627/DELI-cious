package com.pluralsight;

public class Chips {
    private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public double calculatePrice() {
        return 1.50;
    }
}
