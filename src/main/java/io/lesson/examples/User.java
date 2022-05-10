package io.lesson.examples;

import java.io.Serializable;

public class User implements Serializable {
    String name = "anun";
    String surname = "azganunyan";
    int age = 10;
    int weight = 12;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
