package javaClasses.homework_4.arevik_arakelyan.B;

public abstract class Staff {
    protected String names;
    protected String surnames;
    protected  final static   String COMPANY = "My Company";

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
