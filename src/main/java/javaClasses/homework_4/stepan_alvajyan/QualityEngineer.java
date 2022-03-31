package javaClasses.homework_4.stepan_alvajyan;

public class QualityEngineer extends Staff {
 String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    void doWork() {
        System.out.println(name +" "+ surname +" "+type);

    }
}
