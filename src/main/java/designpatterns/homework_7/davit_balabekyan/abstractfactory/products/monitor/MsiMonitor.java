package designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor;

public class MsiMonitor implements Monitor{

    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
