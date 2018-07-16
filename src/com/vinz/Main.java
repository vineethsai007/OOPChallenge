package com.vinz;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Base","Chicken",4.97,"Wheat");
        double price =hamburger.itemsInHamburger();
        hamburger.addHamburgerItem1("Tomato",0.25);
        System.out.println("Total Burger Price after additions is "+ hamburger.itemsInHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",6.12);
        healthyBurger.addHealthAddition1("Egg",1.56);
        healthyBurger.addHamburgerItem1("Lettuce",.55);
        System.out.println("Total Burger Price after additions is "+ healthyBurger.itemsInHamburger());
       // hamburger.add
        DeluxeBurger dxburger = new DeluxeBurger();
        dxburger.addHamburgerItem3("shouldnot do this", 50.5);
        dxburger.itemsInHamburger();
    }
}

