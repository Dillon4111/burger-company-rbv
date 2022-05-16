package com.burgercompany.app;

public class ComboBurger implements BaseBurger{
    private BreadType breadType;
    private MeatChoice meatChoice;
    private final double basePrice = 5;
    private double totalPrice = basePrice;
    private boolean drink, chips;
    private int extrasCount;

    public ComboBurger(BreadType breadType, MeatChoice meatChoice) {
        this.breadType = breadType;
        this.meatChoice = meatChoice;
    }

    public void addDrink() {
        this.drink = true;
        totalPrice += Addition.Drink.getAdditionPrice();
        this.extrasCount ++;
    }

    public void addChips() {
        this.chips = true;
        totalPrice += Addition.Chips.getAdditionPrice();
        this.extrasCount ++;
    }

    public boolean isDrink() {
        return drink;
    }

    public boolean isChips() {
        return chips;
    }

    @Override
    public double baseBurgerPrice() {
        return this.basePrice;
    }

    @Override
    public void extrasDetails() {
        if(this.chips) {
            System.out.println("Chips: " + Addition.Chips.getAdditionPrice());
        }
        if(this.drink) {
            System.out.println("Drink: " + Addition.Drink.getAdditionPrice());
        }
        if(!this.chips && !this.drink) {
            System.out.println("No added extras");
        }
    }

    @Override
    public double totalPrice() {
        return this.totalPrice;
    }

    @Override
    public int extrasCount() {
        return this.extrasCount;
    }
}
