package designpatterns.homework_7.AndSargsyan.factory.factory;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("preparing Veggie burger");
    }
}
