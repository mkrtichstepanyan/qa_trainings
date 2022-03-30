package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Heghine");
        developer.setSurname("Khachatryan");
        developer.setTechStack("Java");
        System.out.println(developer.doWork());

        QualityEngineer engineer = new QualityEngineer();
        engineer.setName("Heghine");
        engineer.setSurname("Khachatryan");
        engineer.setType("Automation");
        System.out.println(engineer.doWork());
    }
}
