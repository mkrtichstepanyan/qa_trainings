package designpatterns.homework_7.AndSargsyan.factory;

import designpatterns.homework_7.AndSargsyan.factory.factory.Burger;
import designpatterns.homework_7.AndSargsyan.factory.factory.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating veggie burger  ");
        System.out.println("Adding Veg meet  ");
        return new VeggieBurger();
    }
}
