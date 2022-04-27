package designpatterns.homework_7.AndSargsyan.factory;

public class MainApp {
    public static void main(String[] args) {

        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();
        System.out.println("--------------------");

        Restaurant chicken = new ChickenBurgerRestaurant();
        chicken.orderBurger();
        System.out.println("--------------------");

        Restaurant vegan = new VeggieBurgerRestaurant();
        vegan.orderBurger();
        System.out.println("---------------------");
    }
}
