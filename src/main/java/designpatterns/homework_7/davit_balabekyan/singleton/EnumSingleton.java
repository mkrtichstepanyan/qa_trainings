package designpatterns.homework_7.davit_balabekyan.singleton;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum EnumSingleton {

    INSTANCE("Petros", 20);

    private final String name;
    private final int age;
}
