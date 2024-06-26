package com.pluralsight;

import com.pluralsight.toppings.Toppings;

import java.util.List;

public class Sandwich {
    private String name;
    private String breadType;
    private List<Toppings> toppingsList;
    private boolean isToasted;

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    private int sandwichSize;

    public Sandwich(String name, String breadType, List<Toppings> toppingsList, boolean isToasted) {
        this.name = name;
        this.breadType = breadType;
        this.toppingsList = toppingsList;
        this.isToasted = isToasted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }


    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public void addTopping(Toppings topping) {
        toppingsList.add(topping);
    }

    public double calculatePrice(){
        // calculate price of sandwich based on the toppings
        return 0;
    }

}
