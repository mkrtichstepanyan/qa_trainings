package designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory;

import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.AsusGpu;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.AsusMonitor;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Gpu;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
