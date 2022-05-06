package javaClasses.homework_4.ani_darbinyan;

public class Work {
    public static void main(String[] args) {
        Developer dev = new Developer("Ani", "Darbinyan", "Java");
        dev.doWork();
        System.out.println("Developer " + dev.getName() + " is working in " + Staff.getCompany());

        QualityEngineer qa = new QualityEngineer("Ani", "Darbinyan", "Automation QA");
        qa.doWork();
        System.out.println("QA engineer " + qa.getName() + " is working in " + Staff.getCompany());
    }
}
