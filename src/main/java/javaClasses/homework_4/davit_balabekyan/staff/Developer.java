package javaClasses.homework_4.davit_balabekyan.staff;

import java.util.Objects;

public class Developer extends Staff {

    private String techStack;

    public Developer(String techStack) {
        this.techStack = techStack;
    }

    public Developer() {
    }

    @Override
    protected void doWork() {
        System.out.println("Developer's name is " + getName());
        System.out.println("Developer's workType is " + getTechStack());
    }

    protected String getTechStack() {
        return techStack;
    }

    protected void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return techStack.equals(developer.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(techStack);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "techStack='" + techStack + '\'' +
                '}';
    }
}
