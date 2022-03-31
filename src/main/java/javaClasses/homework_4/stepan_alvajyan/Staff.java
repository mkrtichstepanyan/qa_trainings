package javaClasses.homework_4.stepan_alvajyan;

public abstract class Staff {
    String name;
    String surname;
    static String company;


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

    public static String getCompany() {
        return  "is from:" + company;
    }

   abstract void doWork();
}