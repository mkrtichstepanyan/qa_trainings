package io.lesson.json.simplejson;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class SimpleJsonReader {

    public static void main(String[] args) throws Exception {
        // parsing file "JSONExample.json"
        JSONObject ob = (JSONObject) new JSONParser().parse(new FileReader("src/main/java/io/lesson/json/test.json"));

        String firstName = (String) ob.get("firstName");
        String lastName = (String) ob.get("lastName");


        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
    }
}

