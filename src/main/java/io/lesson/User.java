package io.lesson;

import java.io.Serializable;

public class User implements Serializable {
    public String name = "anun";
    transient String surname = "azganunyan";
    transient final static int age = 10;
    transient final int age1 = 10;
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
