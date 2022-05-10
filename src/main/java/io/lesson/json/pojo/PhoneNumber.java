package io.lesson.json.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {
    @JsonProperty
    public String type;

    @JsonProperty("phone-number")
    public String phoneNumber;
}

