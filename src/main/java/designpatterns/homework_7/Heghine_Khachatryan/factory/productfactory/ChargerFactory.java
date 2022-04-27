package designpatterns.homework_7.Heghine_Khachatryan.factory.productfactory;

import designpatterns.homework_7.Heghine_Khachatryan.factory.Factory;

public class ChargerFactory extends Factory{
    @Override
    public void produce() {
        System.out.println("Producing a charger");
    }
}