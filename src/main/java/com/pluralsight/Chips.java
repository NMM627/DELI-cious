package com.pluralsight;

public class Chips {
    private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public double calculatePrice() {
        return 1.50;
    }

    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }
}
