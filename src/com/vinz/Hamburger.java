package com.vinz;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public void addHamburgerItem1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerItem2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerItem3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerItem4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemsInHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger on a " + this.breadRollType + " Bread roll " + " with meat as  "
                        +  this.meat +
                " , price is " + this.price);

        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added a " + this.addition1Name + " for an extra off " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for extra off " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + "  an extra off " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + "  an extra off " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}


