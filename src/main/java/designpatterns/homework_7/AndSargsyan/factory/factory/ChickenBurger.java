package designpatterns.homework_7.AndSargsyan.factory.factory;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("preparing chicken burger");
    }
}
