package designpatterns.factory;

import designpatterns.factory.burgers.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    // TODO: FACTORY METHOD
    public abstract Burger createBurger();

}

