package com.burgercompany.app;

import org.junit.Test;

public class BurgerCompanyTest {
    @Test
    public void testBasicBurger() throws Exception {
        Burger burger = new Burger(BaseBurger.BurgerType.BaseBurger, BaseBurger.BreadType.Brioche, BaseBurger.MeatChoice.BlackAngusPatty);
        burger.addTopping(BaseBurger.Topping.Bacon);
        burger.addTopping(BaseBurger.Topping.Cheese);
        burger.addTopping(BaseBurger.Topping.Onion);
        burger.addTopping(BaseBurger.Topping.Ketchup);
        assert(burger.extrasCount() == 4 && burger.baseBurgerPrice() == 5 && burger.totalPrice() == 8.5);
    }

    @Test
    public void testHealthyBurger() throws Exception {
        Burger burger = new Burger(BaseBurger.BurgerType.HealthyBurger, BaseBurger.BreadType.Wholegrain, BaseBurger.MeatChoice.VeganPatty);
        burger.addTopping(BaseBurger.Topping.Bacon);
        burger.addTopping(BaseBurger.Topping.Cheese);
        burger.addTopping(BaseBurger.Topping.Onion);
        burger.addTopping(BaseBurger.Topping.Ketchup);
        burger.addTopping(BaseBurger.Topping.Lettuce);
        burger.addTopping(BaseBurger.Topping.Mayonnaise);
        assert(burger.extrasCount() == 6 && burger.baseBurgerPrice() == 6 && burger.totalPrice() == 10.5);
    }

    @Test
    public void testComboBurger() {
        ComboBurger burger = new ComboBurger(BaseBurger.BreadType.White, BaseBurger.MeatChoice.FishPatty);
        burger.addChips();
        burger.addDrink();
        assert(burger.totalPrice() == 8.5 && burger.isChips() && burger.extrasCount() == 2);
    }
}
