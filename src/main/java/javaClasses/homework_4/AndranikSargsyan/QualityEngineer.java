package javaClasses.homework_4.AndranikSargsyan;

public class QualityEngineer extends Staff {

    private String fieldType;

    public QualityEngineer(String field, String name, String surName) {
        this.fieldType = field;
        super.setName(name);
        super.setSurName(surName);
    }

    @Override
    public String doWork() {
        return getName() + " " + getSurName() + " / " + fieldType + " is from: " + getCompany();
    }
}
