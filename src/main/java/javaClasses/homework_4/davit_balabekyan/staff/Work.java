package javaClasses.homework_4.davit_balabekyan.staff;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Bill");
        developer.setLastName("Gates");
        developer.setTechStack("Java");
        developer.doWork();
        System.out.println("Developer " + developer.getName() + " is working in " + Staff.getCompany());

        QualityEngineer qualityEngineer = new QualityEngineer();
        qualityEngineer.setName("Davit");
        qualityEngineer.setLastName("Balabekyan");
        qualityEngineer.setType("Automation");
        qualityEngineer.doWork();
        System.out.println("Quality engineer " + qualityEngineer.getName() + " is working in " + Staff.getCompany());
    }
}
