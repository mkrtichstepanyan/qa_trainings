package javaClasses.homework_4.ani_darbinyan;

public class Developer extends Staff{
    private String techStack;

    public Developer(String name, String surname, String techStack){
        this.setName(name);
        this.setSurname(surname);
        this.techStack = techStack;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    protected void doWork() {
        System.out.println("Developer name is " + getName());
        System.out.println("Developer techstack is " + getTechStack());
    }
}
