package designpatterns.homework_7.anjela_melqonyan.factory.burger;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println(" Making a Veggie Burger");
    }
}
