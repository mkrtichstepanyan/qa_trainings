package javaClasses.homework_4.arevik_arakelyan.B;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer("Petros", "Petrosyan");
        QualityEngineer qualityEngineer = new QualityEngineer("Arevik", "Arakelyan");
        developer.setTechstack("PHP");
        qualityEngineer.setType("MANUAL");
        System.out.println(developer.doWork());
        System.out.println(qualityEngineer.doWork());

    }
}
