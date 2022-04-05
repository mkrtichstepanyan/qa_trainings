package javaClasses.homework_4.davit_balabekyan.staff;

import java.util.Objects;

public class QualityEngineer extends Staff {

    private String type;

    public QualityEngineer(String name, String lastName, String type) {
        this.setName(name);
        this.setLastName(lastName);
        this.type = type;
    }

    public QualityEngineer() {
    }

    @Override
    protected void doWork() {
        System.out.println("Quality engineer's name is " + getName());
        System.out.println("Quality engineer's workType is " + getType());
    }

    protected String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QualityEngineer that = (QualityEngineer) o;

        return getName().equals(that.getName())
                && getLastName().equals(that.getLastName())
                && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), type);
    }

    @Override
    public String toString() {
        return "QualityEngineer{" + "name='" + getName() + "\'" +
                " lastName='" + getLastName() + '\'' +
                " type='" + type + '\'' +
                '}';
    }
}
