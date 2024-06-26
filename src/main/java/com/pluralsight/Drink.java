package com.pluralsight;

public class Drink {
    private int size;
    private String flavor;

    public Drink(int size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double calculatePrice() {
        if (size == 1) {
            return 2.00;
        }
        if (size == 2) {
            return 2.50;
        }
        if (size == 3) {
            return 3.00;
        }
        return 0;

    }


}

