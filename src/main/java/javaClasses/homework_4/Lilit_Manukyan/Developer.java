package javaClasses.homework_4.Lilit_Manukyan;

public class Developer extends Staff {
    private String techstack;
    public Developer(String name, String lastName, String techstack) {
        super(name, lastName);
        this.techstack = techstack;
    }

    public String getTechstack() {
        return techstack;
    }

    public String setTechstack(String techstack) {
        return techstack;
    }

    @Override
    public void doWork() {
        System.out.println("name is: " + this.getName());
        System.out.println("techstack is " + this.getTechstack());
    }

    public static void getCompany(){
        System.out.println("developer is from " + company);
    }
}