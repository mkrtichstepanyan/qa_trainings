package designpatterns.homework_7.davit_balabekyan.factory.restaurants;

import designpatterns.homework_7.davit_balabekyan.factory.burgers.Burger;
import designpatterns.homework_7.davit_balabekyan.factory.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger... ");
        System.out.println("Adding vegetables... ");
        return new VeggieBurger();
    }
}
