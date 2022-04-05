package javaClasses.homework_4.davit_balabekyan.staff;

public abstract class Staff {

    private static final String COMPANY = "EPAM";
    private String name;
    private String lastName;

    protected static String getCompany() {
        return COMPANY;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected abstract void doWork();
}
