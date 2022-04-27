package designpatterns.homework_7.anjela_melqonyan.factory;


import designpatterns.homework_7.anjela_melqonyan.factory.restaurent.BeefBurgerRestaurant;
import designpatterns.homework_7.anjela_melqonyan.factory.restaurent.Restaurant;
import designpatterns.homework_7.anjela_melqonyan.factory.restaurent.VeggieBurgerRestaurant;

public class Main {

    public static void main(String [] args){
        Restaurant veggieBurger = new VeggieBurgerRestaurant();
        veggieBurger.orderBurger();

        System.out.println("---------------------------");

        Restaurant beefBurger = new BeefBurgerRestaurant();
        beefBurger.orderBurger();

    }

}
