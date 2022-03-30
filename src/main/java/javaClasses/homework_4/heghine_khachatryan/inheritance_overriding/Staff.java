package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public abstract class Staff {
    private String name;
    private String surname;
    public static final String COMPANY = "EPAM Systems LLC";

    public abstract String doWork();

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

    // not sure getCompany method works as was demanded
    public static String getCompany() {
        return "is from " + COMPANY;
    }
}
