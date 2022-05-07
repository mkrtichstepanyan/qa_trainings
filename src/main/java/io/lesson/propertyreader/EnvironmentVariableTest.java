package io.lesson.propertyreader;

public class EnvironmentVariableTest {

    public static void main(String[] args) {
        System.out.println(System.getenv().get("key1"));

//        System.out.println(System.getProperty("key1"));
//        System.out.println(System.getProperty("key2"));

    }
}

