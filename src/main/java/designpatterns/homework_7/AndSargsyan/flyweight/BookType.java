package designpatterns.homework_7.AndSargsyan.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class BookType {

    private final String type;
    private final String author;
    private final String otherData;
}
