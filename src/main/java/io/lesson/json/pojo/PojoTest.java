/*
package io.lesson.json.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PojoTest {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Root root = objectMapper.readValue(new File("src/main/java/io/json/test.json"), Root.class);

        System.out.println(root.age);
        System.out.println(root.firstName);
        System.out.println(root.lastName);
        root.phoneNumbers.forEach(phoneNumber -> {
            System.out.println(phoneNumber.type);
            System.out.println(phoneNumber.phoneNumber);
        });
    }
}
*/
