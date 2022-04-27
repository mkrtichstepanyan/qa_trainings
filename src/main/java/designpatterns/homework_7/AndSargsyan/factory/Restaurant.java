package designpatterns.homework_7.AndSargsyan.factory;

import designpatterns.homework_7.AndSargsyan.factory.factory.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger  ");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
