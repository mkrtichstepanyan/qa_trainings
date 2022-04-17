package designpatterns.factory;

public class MainApp {

    public static void main(String[] args) {

        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("=====================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

        System.out.println("=====================================");

        Restaurant c = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

        System.out.println("=====================================");

    }

}
