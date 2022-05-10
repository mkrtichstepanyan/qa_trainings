package designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu;

public class AsusGpu implements Gpu{

    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
