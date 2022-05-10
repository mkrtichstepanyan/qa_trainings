package io.lesson.propertyreader;


import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private final Properties properties;

    public PropertiesReader(String resourceLocation) {
        properties = new Properties();
        try {
            properties.load(PropertiesReader.class.getClassLoader()
                    .getResourceAsStream(resourceLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
