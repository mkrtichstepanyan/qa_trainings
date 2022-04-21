package designpatterns.factory;

import designpatterns.factory.burgers.Burger;
import designpatterns.factory.burgers.ChickenBurger;
import designpatterns.factory.burgers.VeggieBurger;

public class ChickenBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Chicken Burger...");
        System.out.println("Adding Chicken meet ...");
        return new ChickenBurger();
    }
}

