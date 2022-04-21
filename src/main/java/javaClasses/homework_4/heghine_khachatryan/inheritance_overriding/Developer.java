package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public class Developer extends Staff {
    private String techStack;

    public Developer(String name, String surname, String techStack) {
        super(name, surname);
        this.techStack = techStack;
    }

    @Override
    public String doWork() {
        if (getName() == null || getName().isBlank() || getSurname() == null || getSurname().isBlank()
                || getTechStack() == null || getTechStack().isBlank()) {
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
