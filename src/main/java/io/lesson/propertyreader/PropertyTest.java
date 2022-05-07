package io.lesson.propertyreader;

public class PropertyTest {


    public static void main(String[] args) {
        PropertiesReader properties = new PropertiesReader("application.properties");


        System.out.println(properties.getProperty("env"));
        System.out.println(properties.getProperty("browser"));
        System.out.println(properties.getProperty("version"));

    }
}
