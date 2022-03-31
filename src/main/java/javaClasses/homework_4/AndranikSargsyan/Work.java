package javaClasses.homework_4.AndranikSargsyan;

public class Work {
    public static void main(String[] args) {

        QualityEngineer qualityEngineer = new QualityEngineer("Java");
        System.out.println(qualityEngineer.doWork());

        Staff staff = new Developer("Automation QA","And", "Sargsyan", "epam");
        System.out.println(staff.doWork());
    }
}
