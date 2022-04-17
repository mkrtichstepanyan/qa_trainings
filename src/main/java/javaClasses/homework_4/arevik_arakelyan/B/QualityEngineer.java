package javaClasses.homework_4.arevik_arakelyan.B;

public class QualityEngineer extends Staff {

    private String type;

    public QualityEngineer(String names, String surnames) {
        super(names, surnames);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String doWork() {
        String result = getNames() + " " + getLastName() + " is " + getType()+ " engineer from  " + getCompany() ;
        return  result;
    }
}
