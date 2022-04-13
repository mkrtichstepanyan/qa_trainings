package javaClasses.homework_4.stepan_alvajyan;

public class Work {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.setName("Pogos");
        dev.setSurname("Pogosyan");
        dev.setTechStack("Java");
        dev.doWork();

        QualityEngineer qa = new QualityEngineer();
        qa.setName("Petros");
        qa.setSurname("Petrosyan");
        qa.setType("automation");
        qa.doWork();

    }
}
