package designpatterns.homework_7.anjela_melqonyan.factory.restaurent;

import designpatterns.homework_7.anjela_melqonyan.factory.burger.Burger;

public abstract class Restaurant {

    public void orderBurger() {

        System.out.println(" Ordering burger");
        Burger burger = createBurger();
    }

    public abstract Burger createBurger();
}
