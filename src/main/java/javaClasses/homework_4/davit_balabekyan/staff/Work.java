package javaClasses.homework_4.davit_balabekyan.staff;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer("Bill", "Gates", "Java");
        developer.doWork();
        System.out.println("Developer " + developer.getName() + " is working in " + Staff.getCompany());

        System.out.println("===============================");

        QualityEngineer qualityEngineer = new QualityEngineer("Davit", "Balabekyan", "Automation");
        qualityEngineer.doWork();
        System.out.println("Quality engineer " + qualityEngineer.getName() + " is working in " + Staff.getCompany());
    }
}
