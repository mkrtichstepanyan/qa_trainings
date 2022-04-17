package javaClasses.homework_4;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer();
        QualityEngineer qualityEngineer = new QualityEngineer();
        developer.setNames("Petros");
        developer.setLastName("Petrosyan");
        developer.setTechstack("PHP");
        qualityEngineer.setNames("Arevik");
        qualityEngineer.setLastName("Arakelyan");
        qualityEngineer.setType("MANUAL");
        System.out.println(developer.doWork());
        System.out.println(qualityEngineer.doWork());

    }
}
