package designpatterns.homework_7.AndSargsyan.factory;

import designpatterns.homework_7.AndSargsyan.factory.factory.Burger;
import designpatterns.homework_7.AndSargsyan.factory.factory.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating Chicken burger  ");
        System.out.println("Adding Chicken meet  ");
        return new ChickenBurger();
    }
}
