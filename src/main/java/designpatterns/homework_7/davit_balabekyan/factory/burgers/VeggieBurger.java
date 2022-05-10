package designpatterns.homework_7.davit_balabekyan.factory.burgers;

public class VeggieBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparing veggie burger... ");
    }
}
