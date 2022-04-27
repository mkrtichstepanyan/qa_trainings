package designpatterns.homework_7.AndSargsyan.factory;

import designpatterns.homework_7.AndSargsyan.factory.factory.BefBurger;
import designpatterns.homework_7.AndSargsyan.factory.factory.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef burger  ");
        System.out.println("Adding Beef meet ");
        return new BefBurger();
    }
}
