package designpatterns.homework_7.davit_balabekyan.abstractfactory;

import designpatterns.homework_7.davit_balabekyan.abstractfactory.factories.AsusManufacturer;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.factories.Company;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.factories.MsiManufacturer;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.Monitor;

public class MainApp {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        msi.createMonitor().assemble();
        msi.createGPU().assemble();
        System.out.println("=========================");

        Company asus = new AsusManufacturer();
        asus.createMonitor().assemble();
        asus.createGPU().assemble();
    }
}
