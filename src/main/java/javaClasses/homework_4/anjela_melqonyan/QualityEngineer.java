package javaClasses.homework_4.anjela_melqonyan;

public class QualityEngineer extends  Staff{
    public String tape;
    public QualityEngineer(String tape){

        this.tape=tape;
    }

    public String getTape() {

        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    @Override
    protected void doWork() {
        System.out.println("Quality engineers name is "+ " " +getName());
        System.out.println("Quality engineers work tape is" +" " + getTape());

    }
}
