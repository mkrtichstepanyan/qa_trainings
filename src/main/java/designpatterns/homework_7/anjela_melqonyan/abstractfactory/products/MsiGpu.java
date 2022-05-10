package designpatterns.homework_7.anjela_melqonyan.abstractfactory.products;

public class MsiGpu implements Gpu{

    @Override
    public void assemble() {
        System.out.println("Assembling Msi Gpu");
    }
}
