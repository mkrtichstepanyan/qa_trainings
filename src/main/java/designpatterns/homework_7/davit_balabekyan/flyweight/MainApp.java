package designpatterns.homework_7.davit_balabekyan.flyweight;

import java.util.Random;

public class MainApp {

    private static final int TV_TYPES = 2;
    private static final int TVS_TO_INSERT = 7000000;

    public static void main(String[] args) {

        Store store = new Store();
        for (int i = 0; i < TVS_TO_INSERT / 2; i++) {
            store.storeTv(getRandomPrice(), "Plasma");
            store.storeTv(getRandomPrice(), "LED");
        }

        System.out.println(TVS_TO_INSERT + " Tvs Inserted");
        System.out.println("================================");
        System.out.println("Memory usage: ");
        System.out.println("Tv type (15 bytes) * " + TVS_TO_INSERT + " TvType size (5 bytes) * " + TV_TYPES);
        System.out.println("================================");
        System.out.println("Total: " + ((TVS_TO_INSERT * 20 + TV_TYPES * 30) / 1024 / 1024) +
                "MB (Instead of " + ((TVS_TO_INSERT * 50) / 1024 / 1024) + "MB");
    }

    private static double getRandomPrice() {
        return new Random().nextDouble();
    }
}
