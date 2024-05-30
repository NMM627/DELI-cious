package com.pluralsight;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Homescreen {

    public static void main(String[] args) {
        new Homescreen().display();
    }


    public void display() {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {

        System.out.println("1) New Order");
        System.out.println("0) Exit");
        int homeScreen = scanner.nextInt();
        Customer customer = new Customer("Kris Letang");
        Order order = new Order(customer);
        switch (homeScreen) {
            case 1:
                newOrder();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    private void newOrder() {
       Scanner scanner = new Scanner(System.in);
       while(true)
       {

           System.out.println("1) Add Sandwich");
           System.out.println("2) Add Drink");
           System.out.println("3) Add Chips");
           System.out.println("4) Checkout");
           System.out.println("0) Cancel Order");
           int newOrder = scanner.nextInt();
           switch (newOrder) {
               case 1:
                   addSandwich();
                   break;
               case 2:
                   addDrink();
                   break;
               case 3:
                   addChips();
                   break;
               case 4:
                   checkout();
                   break;
               case 0:
                  return;
               default:
                   System.out.println("Invalid choice. Please try again.");

           }





    }

}

    private void checkout() {
    }

    private void addChips() {
    }

    private void addDrink() {
    }

    private void addSandwich() {
        Scanner scanner = new Scanner(System.in);
        Sandwich sandwich = new Sandwich("Bread","whiteBread", new ArrayList(), false);
        while(true)
        {
            System.out.println("1) Select bread");
            System.out.println("2) Sandwich size");
            System.out.println("3) Select premium toppings");
            System.out.println("4) Select regular toppings");
            System.out.println("0) Toasted?");
            int addSandwich = scanner.nextInt();
            switch (addSandwich) {
                case 1:
                    selectBread(sandwich);
                    break;
                case 2:
                    sandwichSize(sandwich);
                    break;
                case 3:
                    selectPremiumToppings(sandwich);
                    break;
                case 4:
                    selectRegularToppings(sandwich);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }

    private void selectRegularToppings(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1) lettuce");
            System.out.println("2) peppers");
            System.out.println("3) onions");
            System.out.println("4) tomatoes");
            System.out.println("5) jalapenos");
            System.out.println("6) cucumbers");
            System.out.println("7) pickles");
            System.out.println("8) guacamole");
            System.out.println("9) mushrooms");
            System.out.println("10) mayo");
            System.out.println("11) mustard");
            System.out.println("12 ketchup");
            System.out.println("13) ranch");
            System.out.println("14) thousand islands");
            System.out.println("15) vinaigrette");
            System.out.println("16) au jus");
            System.out.println("17) sauce");
            int selectRegularToppings = scanner.nextInt();
            switch (selectRegularToppings) {
                case 1:
                    sandwich.addTopping(new RegularTopping("lettuce",0));
                    break;
                case 2:
                    sandwich.addTopping(new RegularTopping("peppers",0));
                    break;
                case 3:
                    sandwich.addTopping(new RegularTopping("onions",0));
                    break;
                case 4:
                    sandwich.addTopping(new RegularTopping("tomatoes",0));
                    break;
                case 5:
                    sandwich.addTopping(new RegularTopping("jalapenos",0));
                    break;
                case 6:
                    sandwich.addTopping(new RegularTopping("cucumbers",0));
                    break;
                case 7:
                    sandwich.addTopping(new RegularTopping("pickles",0));
                    break;
                case 8:
                    sandwich.addTopping(new RegularTopping("guacamole",0));
                    break;
                case 9:
                    sandwich.addTopping(new RegularTopping("mushrooms",0));
                    break;
                case 10:
                    sandwich.addTopping(new RegularTopping("mayo",0));
                    break;
                case 11:
                    sandwich.addTopping(new RegularTopping("mustard",0));
                    break;
                case 12:
                    sandwich.addTopping(new RegularTopping("ketchup",0));
                    break;
                case 13:
                    sandwich.addTopping(new RegularTopping("ranch",0));
                    break;
                case 14:
                    sandwich.addTopping(new RegularTopping("thousand islands",0));
                    break;
                case 15:
                    sandwich.addTopping(new RegularTopping("vinaigrette",0));
                    break;
                case 16:
                    sandwich.addTopping(new RegularTopping("au jus",0));
                    break;
                case 17:
                    sandwich.addTopping(new RegularTopping("sauce",0));
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }

    private void selectPremiumToppings(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1) steak");
            System.out.println("2) ham");
            System.out.println("3) salami");
            System.out.println("4) roast beef");
            System.out.println("5) chicken");
            System.out.println("6) bacon");
            System.out.println("7) americanCheese");
            System.out.println("8) provoloneCheese");
            System.out.println("9) cheddarCheese");
            System.out.println("10) swissCheese");
            int selectPremiumToppings = scanner.nextInt();
            switch (selectPremiumToppings) {
                case 1:
                    sandwich.addTopping(new Meat("steak", 0));
                    break;
                case 2:
                    sandwich.addTopping(new Meat("ham",0));
                    break;
                case 3:
                    sandwich.addTopping(new Meat("salami",0));
                    break;
                case 4:
                    sandwich.addTopping(new Meat("roast beef", 0));
                    break;
                case 5:
                    sandwich.addTopping(new Meat("chicken",0));
                    break;
                case 6:
                    sandwich.addTopping(new Meat("bacon",0));
                    break;
                case 7:
                    sandwich.addTopping(new Cheese("american",0));
                    break;
                case 8:
                    sandwich.addTopping(new Cheese("provolone",0));
                    break;
                case 9:
                    sandwich.addTopping(new Cheese("cheddar", 0));
                    break;
                case 10:
                    sandwich.addTopping(new Cheese("swiss",0));
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");


            }

        }
    }

    private void sandwichSize(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        while(true) {


            System.out.println("1) fourInch");
            System.out.println("2) eightInch");
            System.out.println("3) twelveInch");
            int sandwichSize = scanner.nextInt();
            switch (sandwichSize) {
                case 1:
                    sandwich.setSandwichSize(4);
                    return;
                case 2:
                    sandwich.setSandwichSize(8);
                    return;
                case 3:
                    sandwich.setSandwichSize(12);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void selectBread(Sandwich sandwich) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1) whiteBread");
            System.out.println("2) wheatBread");
            System.out.println("3) ryeBread");
            System.out.println("0) wrap");
            int selectBread = scanner.nextInt();
            switch (selectBread) {
                case 1:
                    sandwich.setBreadType("whiteBread");
                    return;
                case 2:
                    sandwich.setBreadType("wheatBread");
                    return;
                case 3:
                    sandwich.setBreadType("ryeBread");
                    return;
                case 0:
                    sandwich.setBreadType("wrap");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
