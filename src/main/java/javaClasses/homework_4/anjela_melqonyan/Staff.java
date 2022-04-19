package javaClasses.homework_4.anjela_melqonyan;

public  abstract class Staff {
    private String name;
    private String surname;
    protected   final static String company = "Epam";

    protected  String getName(){
        return name;
    }
    private String getSurname(){
        return surname;
    }
    protected static  String getCompany(){
        return company;
    }
    protected void setName(String name){
        this.name=name;
    }
    protected void setSurname(String surname){
        this.surname=surname;
    }
    protected  abstract void doWork();

}
