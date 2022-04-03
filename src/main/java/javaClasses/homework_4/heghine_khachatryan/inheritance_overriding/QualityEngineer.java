package javaClasses.homework_4.heghine_khachatryan.inheritance_overriding;

public class QualityEngineer extends Staff {
    private String type;

    public QualityEngineer(String name, String surname, String type) {
        super(name, surname);
        this.type = type;
    }

    @Override
    public String doWork() {
        if (getName() == null || getName().isBlank() || getSurname() == null || getSurname().isBlank()
                || getType() == null || getType().isBlank()) {
            return "Please set engineer's name/surname/type and then try again.";
        }
        return getName() + " " + getSurname() + " " +
                Staff.getCompany() + " and work as a " + getType() + " engineer";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
