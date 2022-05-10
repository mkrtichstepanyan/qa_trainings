package designpatterns.homework_7.anjela_melqonyan.factory.restaurent;


import designpatterns.homework_7.anjela_melqonyan.factory.burger.BeefBurger;
import designpatterns.homework_7.anjela_melqonyan.factory.burger.Burger;

public class BeefBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println(" Making Beef Burger");
        System.out.println(" Adding Beef meet ");
        return new BeefBurger();
    }
}
