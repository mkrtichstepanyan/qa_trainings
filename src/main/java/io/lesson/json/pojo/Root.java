package io.lesson.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty
    String firstName;

    @JsonProperty
    String lastName;

    @JsonProperty
    int age;

    @JsonProperty
    ArrayList<PhoneNumber> phoneNumbers;
}
