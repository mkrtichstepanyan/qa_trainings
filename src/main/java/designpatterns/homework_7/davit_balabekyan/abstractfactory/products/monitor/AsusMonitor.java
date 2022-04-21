package designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor;

public class AsusMonitor implements Monitor{

    @Override
    public void assemble() {
        System.out.println("Assembling ASUS Monitor");
    }
}
