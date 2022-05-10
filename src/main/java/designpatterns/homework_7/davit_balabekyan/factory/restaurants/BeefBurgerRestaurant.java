package designpatterns.homework_7.davit_balabekyan.factory.restaurants;

import designpatterns.homework_7.davit_balabekyan.factory.burgers.BeefBurger;
import designpatterns.homework_7.davit_balabekyan.factory.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger... ");
        System.out.println("Adding Beef meet... ");
        return new BeefBurger();
    }
}
