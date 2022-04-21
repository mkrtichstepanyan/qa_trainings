package designpatterns.homework_7.Lilit_Manukyan.abstractFactory;


import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories.AsusManufacturer;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories.Company;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories.MsiManufacturer;

public class MainApp {
    public static void main(String[] args) {
        Company asus = new AsusManufacturer();
        Company msi = new MsiManufacturer();
        System.out.println(asus.createGpu());
        System.out.println(asus.createMonitor());
        System.out.println(msi.createMonitor());
        System.out.println(msi.createGpu());
    }
}
