package designpatterns.homework_7.anjela_melqonyan.abstractfactory;

import designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory.AsusManufacturer;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory.Company;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory.MsiManufacturer;

public class Main {
    public static void main (String [] args){

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        asus.createGpu().assemble();
        asus.createMonitor().assemble();
        msi.createGpu().assemble();
        msi.createMonitor().assemble();

    }
}
