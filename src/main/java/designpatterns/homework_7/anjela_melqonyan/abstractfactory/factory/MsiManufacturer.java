package designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory;

import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Gpu;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Monitor;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.MsiGpu;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
