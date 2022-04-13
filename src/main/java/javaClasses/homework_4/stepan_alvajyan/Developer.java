package javaClasses.homework_4.stepan_alvajyan;

public class Developer extends Staff {
    String techStack;

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    void doWork() {
        System.out.println(name + " " + surname + " "+ techStack);
    }
}
