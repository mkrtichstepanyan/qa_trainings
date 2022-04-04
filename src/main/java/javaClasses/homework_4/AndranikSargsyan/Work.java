package javaClasses.homework_4.AndranikSargsyan;

public class Work {
    public static void main(String[] args) {

        Staff staff = new Developer("Automation QA","And", "Sargsyan", "epam");
        System.out.println(staff.doWork());

        Staff staff1 = new QualityEngineer("Java", "Karl");
        System.out.println(staff1.doWork());
    }
}
