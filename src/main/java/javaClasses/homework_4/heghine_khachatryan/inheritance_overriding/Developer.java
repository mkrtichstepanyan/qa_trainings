package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public class Developer extends Staff {
    private String techStack;

    @Override
    public String doWork() {
        if (getName() == null || getSurname() == null || getTechStack() == null) {
            return "Please set developer's name/surname/techStack and then try again.";
        }
        return getName() + " " + getSurname() + " " + Staff.getCompany() +
                " and work as a " + getTechStack() + " developer";
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
}
