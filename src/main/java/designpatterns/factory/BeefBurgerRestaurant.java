package designpatterns.factory;

import designpatterns.factory.burgers.BeefBurger;
import designpatterns.factory.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Adding Beef meet...");
        return new BeefBurger();
    }

}
