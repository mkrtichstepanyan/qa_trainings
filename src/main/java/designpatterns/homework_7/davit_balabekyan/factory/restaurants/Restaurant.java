package designpatterns.homework_7.davit_balabekyan.factory.restaurants;

import designpatterns.homework_7.davit_balabekyan.factory.burgers.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering burger");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
