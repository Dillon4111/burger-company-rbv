package com.burgercompany.app;

import java.util.ArrayList;

public class Burger implements BaseBurger {
    private BreadType breadType;
    private MeatChoice meatChoice;
    private BurgerType burgerType;
    private ArrayList<Topping> toppings = new ArrayList<>();
    private double basePrice;
    private double totalPrice;
    private int toppingsCount = 0, maxToppings;

    public Burger(BurgerType burgerType, BreadType breadType, MeatChoice meatChoice) {
        this.burgerType = burgerType;
        this.breadType = breadType;
        this.meatChoice = meatChoice;
        if(burgerType.equals(BurgerType.BaseBurger)) {
            maxToppings = 4;
            basePrice = 5.0;
        }
        else if(burgerType.equals(BurgerType.HealthyBurger)) {
            maxToppings = 6;
            basePrice = 6.0;
        }
        totalPrice = basePrice;
    }

    public void addTopping(Topping topping) throws Exception {
        if(toppingsCount < maxToppings) {
            this.toppings.add(topping);
            totalPrice += topping.getToppingPrice();
            toppingsCount ++;
        }
        else {
            throw new Exception("Only " + maxToppings + " toppings allowed");
        }
    }

    @Override
    public double baseBurgerPrice() {
        return this.basePrice;
    }

    @Override
    public void extrasDetails() {
        for(Topping topping: this.toppings) {
            System.out.println(topping.name() + ": " + topping.getToppingPrice());
        }
    }

    @Override
    public double totalPrice() {
        return this.totalPrice;
    }

    @Override
    public int extrasCount() {
        return this.toppingsCount;
    }
}
