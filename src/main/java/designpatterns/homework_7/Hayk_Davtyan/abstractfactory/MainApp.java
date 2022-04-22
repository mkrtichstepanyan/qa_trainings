package designpatterns.homework_7.Hayk_Davtyan.abstractfactory;

import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories.AsusManufacturer;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories.Company;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories.MsiManufacturer;

public class MainApp {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();
        msi.createMonitor();
        asus.createMonitor();
    }
}
