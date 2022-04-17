package javaClasses.homework_4.AndranikSargsyan;

public abstract class Staff {

    private String name;
    private String surName;
    private static String company;

    public abstract String doWork();

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Staff.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
