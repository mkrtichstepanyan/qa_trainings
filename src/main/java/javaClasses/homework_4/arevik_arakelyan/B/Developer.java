package javaClasses.homework_4.arevik_arakelyan.B;

public class Developer extends Staff {
    private  String techstack;

    public Developer(String names, String surnames) {
        super(names, surnames);
    }

    private String getTechstack() {
        return techstack;
    }

    protected void setTechstack(String techstack) {
        this.techstack = techstack;
    }

    @Override
    protected String doWork() {
        String result = getNames() + " " + getLastName()  + " is " + getTechstack()+ " developer from " + getCompany();
        return result;
    }
}
