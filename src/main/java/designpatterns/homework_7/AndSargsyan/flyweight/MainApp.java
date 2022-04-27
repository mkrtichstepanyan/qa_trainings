package designpatterns.homework_7.AndSargsyan.flyweight;

import java.util.List;
import java.util.Random;

public class MainApp {

    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10000000;

    public static void main(String[] args) {

        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follet", "Stuff");
            store.storeBook(getRandomName(), getRandomPrice(), "Fantasy", "Ingram", "Extra");
        }
        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT + " + BookTypes Size (30 bytes) * " + BOOK_TYPES + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOK_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");

    }

    private static String getRandomName() {
        List<String> books = List.of("book 1", "book 2", "book 3", "book 4", "book 5", "book 6", "book 7", "book 8", "book 9", "book 10");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble();
    }
}
