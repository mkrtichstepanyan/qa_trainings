package javaClasses.homework_4.arevik_arakelyan.B;

public abstract class Staff {
    private String names;
    private String surnames;
    protected  final static   String COMPANY = "My Company";

    public Staff(String names, String surnames) {
        this.names = names;
        this.surnames = surnames;
    }

    protected String getNames() {
        return names;
    }

    protected String getLastName() {
        return surnames;
    }

    protected static String getCompany() {
        return COMPANY;
    }

    protected void setNames(String names) {
        this.names = names;
    }

    protected void setLastName(String surnames) {
        this.surnames = surnames;
    }


     protected abstract String doWork();

}
