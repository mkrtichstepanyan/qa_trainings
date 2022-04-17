package designpatterns.abstractfactory.factories;


import designpatterns.abstractfactory.products.gpu.Gpu;
import designpatterns.abstractfactory.products.monitor.Monitor;
import designpatterns.abstractfactory.products.gpu.MsiGpu;
import designpatterns.abstractfactory.products.monitor.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}