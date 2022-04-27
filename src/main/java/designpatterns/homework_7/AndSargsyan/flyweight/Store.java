package designpatterns.homework_7.AndSargsyan.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String author, String otherData) {
        BookType bookType = BookFactory.getBookType(type, author, otherData);
        books.add(new Book(name, price, bookType));
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }
}
