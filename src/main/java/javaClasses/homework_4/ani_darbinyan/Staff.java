package javaClasses.homework_4.ani_darbinyan;

public abstract class Staff {
    private String name;
    private String surname;
    private static final String COMPANY = "EPAM";

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getCompany() {
        return COMPANY;
    }

    protected abstract void doWork();
}
