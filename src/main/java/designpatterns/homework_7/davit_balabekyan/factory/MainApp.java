package designpatterns.homework_7.davit_balabekyan.factory;

import designpatterns.homework_7.davit_balabekyan.factory.restaurants.BeefBurgerRestaurant;
import designpatterns.homework_7.davit_balabekyan.factory.restaurants.ChickenBurgerRestaurant;
import designpatterns.homework_7.davit_balabekyan.factory.restaurants.Restaurant;
import designpatterns.homework_7.davit_balabekyan.factory.restaurants.VeggieBurgerRestaurant;

public class MainApp {
    public static void main(String[] args) {
        Restaurant beefBurger = new BeefBurgerRestaurant();
        beefBurger.orderBurger();

        System.out.println("======================");

        Restaurant chickenBurger = new ChickenBurgerRestaurant();
        chickenBurger.orderBurger();

        System.out.println("======================");

        Restaurant veggieBurger = new VeggieBurgerRestaurant();
        veggieBurger.orderBurger();
    }
}
