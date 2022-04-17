package designpatterns.homework_7.Heghine_Khachatryan.factory.products;

import designpatterns.homework_7.Heghine_Khachatryan.factory.Product;

public class Phone implements Product {
    @Override
    public void create() {
        System.out.println("create a phone");
    }
}
