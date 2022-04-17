package designpatterns.homework_7.Heghine_Khachatryan.factory;

import designpatterns.homework_7.Heghine_Khachatryan.factory.productfactory.ChargerFactory;
import designpatterns.homework_7.Heghine_Khachatryan.factory.productfactory.NotebookFactory;
import designpatterns.homework_7.Heghine_Khachatryan.factory.productfactory.PhoneFactory;

public class Main {
    public static void main(String[] args) {
        Factory phoneFactory = new PhoneFactory();
        phoneFactory.produce();

        Factory chargerFactory = new ChargerFactory();
        chargerFactory.produce();

        Factory notebookFactory = new NotebookFactory();
        notebookFactory.produce();
    }
}
