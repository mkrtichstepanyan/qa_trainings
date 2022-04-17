package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public class Work {
    public static void main(String[] args) {
        Developer developer = new Developer("Heghine","Khachatryan","Java");
        System.out.println(developer.doWork());

        QualityEngineer engineer = new QualityEngineer("","Khachatryan","Automation");
        System.out.println(engineer.doWork());

        System.out.println("Example of calling getCompany() static method --> " + Staff.getCompany());
    }
}
