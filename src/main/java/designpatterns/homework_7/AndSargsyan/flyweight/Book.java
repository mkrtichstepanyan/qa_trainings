package designpatterns.homework_7.AndSargsyan.flyweight;

import lombok.Data;

@Data
public class Book {

    private final String name;
    private final double price;
    private final BookType bookType;
}
