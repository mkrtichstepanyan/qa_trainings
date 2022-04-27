package designpatterns.homework_7.anjela_melqonyan.factory.restaurent;

import designpatterns.homework_7.anjela_melqonyan.factory.burger.Burger;
import designpatterns.homework_7.anjela_melqonyan.factory.burger.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {

        System.out.println(" Making Veggie Burger");
        System.out.println(" Adding vegetables ");
        return new VeggieBurger();
    }
}
