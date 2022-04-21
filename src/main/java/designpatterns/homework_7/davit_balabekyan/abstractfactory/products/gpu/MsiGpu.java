package designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu;

public class MsiGpu implements Gpu{

    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
