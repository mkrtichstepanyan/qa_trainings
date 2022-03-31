package javaClasses.homework_4.AndranikSargsyan;

public class QualityEngineer extends Staff{

    private String fieldType;

    public QualityEngineer(String field){
        this.fieldType = field;
    }

    @Override
    public String doWork() {
        setName("Jon");
        setCompany("EGS");
        return  getName() + " / " + fieldType + " is from: " + getCompany();
    }
}
