package designpatterns.homework_7.davit_balabekyan.abstractfactory.factories;

import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.Monitor;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu.Gpu;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu.MsiGpu;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.MsiMonitor;

public class MsiManufacturer extends Company{

    @Override
    public Gpu createGPU() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
