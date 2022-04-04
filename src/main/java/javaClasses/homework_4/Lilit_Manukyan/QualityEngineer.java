package javaClasses.homework_4.Lilit_Manukyan;

public class QualityEngineer extends Staff {
    private String type;

    public QualityEngineer(String name, String lastName, String type) {
        super(name, lastName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("name is: " + this.getName());
        System.out.println("type is " + this.getType());
    }
}
