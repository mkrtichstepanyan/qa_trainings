package designpatterns.factory.burgers;

public class ChickenBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparing ChickenBurger Burger...");
    }
}
