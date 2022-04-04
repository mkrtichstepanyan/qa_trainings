package javaClasses.homework_4.AndranikSargsyan;

public class QualityEngineer extends Staff{

    private String fieldType;

    public QualityEngineer(String field, String name){
        this.fieldType = field;
        super.setName(name);
    }

    @Override
    public String doWork() {
        return  getName() + " / " + fieldType + " is from: " + getCompany();
    }
}
