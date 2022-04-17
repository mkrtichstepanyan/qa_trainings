package designpatterns.homework_7.Heghine_Khachatryan.factory.products;

import designpatterns.homework_7.Heghine_Khachatryan.factory.Product;

public class Charger implements Product {
    @Override
    public void create() {
        System.out.println("Create a charger");
    }
}
