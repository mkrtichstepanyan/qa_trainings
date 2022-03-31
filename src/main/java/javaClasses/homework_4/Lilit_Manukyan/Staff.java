package javaClasses.homework_4.Lilit_Manukyan;

public abstract class Staff {
    private String name;
    private String lastName;
    static String company;

    public Staff(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract void doWork();

    public static void getCompany() {
        System.out.println("{developer/engineerName} is from " + company);
    }
}