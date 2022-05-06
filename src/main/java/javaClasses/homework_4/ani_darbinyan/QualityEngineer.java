package javaClasses.homework_4.ani_darbinyan;

public class QualityEngineer extends Staff{
    private String techStack;

    public QualityEngineer(String name, String surname, String techStack) {
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
        System.out.println("QA engineer name is " + getName());
        System.out.println("QA engineer techstack is " + getTechStack());
    }
}
