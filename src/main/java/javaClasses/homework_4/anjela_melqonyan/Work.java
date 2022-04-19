package javaClasses.homework_4.anjela_melqonyan;

public class Work {
    public static void main(String [] args){
        Developer developer= new Developer();
        developer.setName("Poxos");
        developer.setSurname("Poxosyan");
        developer.setTechStack(" Java");
        developer.doWork();
        System.out.println("Developer " + developer.getName() + " is working in " + Staff.getCompany());

        QualityEngineer qualityEngineer=new QualityEngineer("");
        qualityEngineer.setName("Petros");
        qualityEngineer.setSurname("Petrosyan");
        qualityEngineer.setTape("Automation");
        qualityEngineer.doWork();
        System.out.println("Quality engineer " + qualityEngineer.getName() + " is working in " + Staff.getCompany());

    }
}
