package designpatterns.homework_7.AndSargsyan.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {

    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String author, String otherData) {
        if (bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type, author, otherData));
        }
        return bookTypes.get(type);
    }
}
