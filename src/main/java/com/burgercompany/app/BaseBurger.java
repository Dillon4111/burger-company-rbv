package com.burgercompany.app;

public interface BaseBurger {
    enum BreadType {Wholegrain, White, Brioche, Ciabatta}
    enum MeatChoice {BlackAngusPatty, KobeBeefPatty, VeganPatty, FishPatty}
    enum BurgerType {BaseBurger, HealthyBurger}
    enum Addition {Drink(1.5), Chips(2);

        private final double price;

        Addition(double p) {
            this.price = p;
        }

        double getAdditionPrice(){
            return this.price;
        }
    }
    enum Topping {Cheese(1), Onion(1), Bacon(1), Lettuce(.5), Ketchup(.5), Mayonnaise(.5);

        private final double price;

        Topping(double p) {
            this.price = p;
        }

        double getToppingPrice(){
            return this.price;
        }
    }

    double baseBurgerPrice();
    void extrasDetails();
    double totalPrice();
    int extrasCount();
}
