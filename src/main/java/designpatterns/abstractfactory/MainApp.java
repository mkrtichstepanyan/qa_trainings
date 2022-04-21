package designpatterns.abstractfactory;

import designpatterns.abstractfactory.factories.AsusManufacturer;
import designpatterns.abstractfactory.factories.Company;
import designpatterns.abstractfactory.factories.MsiManufacturer;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();
        msi.createMonitor();
        msi.createMonitor();
        msi.createMonitor();
        asus.createGpu();


    }
}
