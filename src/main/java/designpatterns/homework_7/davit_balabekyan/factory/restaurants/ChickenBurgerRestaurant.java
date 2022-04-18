package designpatterns.homework_7.davit_balabekyan.factory.restaurants;

import designpatterns.homework_7.davit_balabekyan.factory.burgers.Burger;
import designpatterns.homework_7.davit_balabekyan.factory.burgers.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Chicken Burger... ");
        System.out.println("Adding chicken meet... ");
        return new ChickenBurger();
    }
}
