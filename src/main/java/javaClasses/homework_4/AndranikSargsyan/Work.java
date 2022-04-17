package javaClasses.homework_4.AndranikSargsyan;

public class Work {
    public static void main(String[] args) {

        Staff staff = new Developer("Automation QA","And", "Sargsyan", "epam");
        System.out.println(staff.doWork());

        Staff staff1 = new QualityEngineer("Javal", "Adam", "Sendler");
        System.out.println(staff1.doWork());
    }
}
