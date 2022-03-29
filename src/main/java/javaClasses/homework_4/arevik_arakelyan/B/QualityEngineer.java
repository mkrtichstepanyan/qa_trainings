package javaClasses.homework_4.arevik_arakelyan.B;

public class QualityEngineer extends Staff {

    private String type;

    protected String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    protected String doWork() {
        String result = getNames() + " " + getLastName() + " is " + getType()+ " engineer from  " + getCompany() ;
        return  result;
    }
}
