package designpatterns.homework_7.AndSargsyan.abstractFactory;

import designpatterns.homework_7.AndSargsyan.abstractFactory.factories.AcerFactory;
import designpatterns.homework_7.AndSargsyan.abstractFactory.factories.Company;
import designpatterns.homework_7.AndSargsyan.abstractFactory.factories.HPFactory;

public class MainApp {
    public static void main(String[] args) {

        Company acer = new AcerFactory();
        Company hp = new HPFactory();
        acer.createGpu();
        acer.createMonitor();
        hp.createGpu();
        hp.createMonitor();
    }
}
