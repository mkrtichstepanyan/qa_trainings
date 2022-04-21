package javaClasses.homework_4.AndranikSargsyan;

public class Developer extends Staff {

    private final String techStack;

    public Developer(String skill, String name, String surName, String company) {
        this.techStack = skill;
        super.setName(name);
        super.setSurName(surName);
        Staff.setCompany(company);
    }

    public Developer(String techStack){
        this.techStack = techStack;
    }

    @Override
    public String doWork() {
        setCompany("epam");
        return getName() + " / " + getSurName() + " is from: " + getCompany() + " " + techStack;
    }
}
