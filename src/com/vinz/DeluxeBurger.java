package com.vinz;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Bacon&Chicken", 14.50, "White");
        super.addHamburgerItem1("Drink",1.45);
        super.addHamburgerItem2("Chips",2.68);

    }

    @Override
    public void addHamburgerItem1(String name, double price) {
        System.out.println("Cannot Add this item to deluxe burger");
    }

    @Override
    public void addHamburgerItem2(String name, double price) {
        System.out.println("Cannot Add this item to deluxe burger");
    }

    @Override
    public void addHamburgerItem3(String name, double price) {
        System.out.println("Cannot Add this item to deluxe burger");
    }

    @Override
    public void addHamburgerItem4(String name, double price) {
        System.out.println("Cannot Add this item to deluxe burger");
    }
}
