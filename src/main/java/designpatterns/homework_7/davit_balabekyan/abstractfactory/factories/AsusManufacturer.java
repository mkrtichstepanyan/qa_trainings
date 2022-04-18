package designpatterns.homework_7.davit_balabekyan.abstractfactory.factories;

import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu.AsusGpu;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu.Gpu;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.AsusMonitor;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.Monitor;

public class AsusManufacturer extends Company{

    @Override
    public Gpu createGPU() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
