package javaClasses.homework_4.Lilit_Manukyan;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer("Arman", "Aramyan", "java");
        QualityEngineer qualityEngineer = new QualityEngineer("Ann", "Hakobyan", "manual");
        Staff.company = "EPAM";
        developer.getTechstack();
        developer.getLastName();
        developer.getName();
        developer.doWork();
        Developer.getCompany();
        qualityEngineer.getType();
        qualityEngineer.doWork();
        QualityEngineer.getCompany();
    }
}