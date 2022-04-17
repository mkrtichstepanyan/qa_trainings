package designpatterns.factory;

import designpatterns.factory.burgers.Burger;
import designpatterns.factory.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        System.out.println("Adding Vegetables ...");
        return new VeggieBurger();
    }

}

