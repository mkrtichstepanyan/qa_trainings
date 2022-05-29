package io.homework_8.heghine_khachatryan.excel;

import java.util.Arrays;
import java.util.List;

public class QAStudents {
    private String name;
    private String surname;
    private String age;
    private String gender;
    private String place;

    public QAStudents(String name, String surname, String age, String gender, String place) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "QAStudents{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    public static List<QAStudents> QAStudentsList () {
       QAStudents aqaStudents = new QAStudents("Heghine","Khachatryan",
                "1996 / 7 / 9", "female","Epam");
        QAStudents aqaStudents1 = new QAStudents("Lilit","Gevorgyan",
                "1995 / 6 / 19", "female","Epam");
       QAStudents aqaStudents2 = new QAStudents("Alyosha","Papovich",
                "2000 / 4 / 29", "male","Epam");

        return Arrays.asList(aqaStudents,aqaStudents1,aqaStudents2);
    }
}
