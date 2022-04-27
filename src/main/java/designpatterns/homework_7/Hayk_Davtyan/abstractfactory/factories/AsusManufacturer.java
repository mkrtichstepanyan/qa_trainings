package designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories;

import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.gpu.AsusGpu;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.gpu.Gpu;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.monitor.AsusMonitor;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.monitor.Monitor;

public class AsusManufacturer extends Company{

    @Override
    public Gpu createGpu() { return new AsusGpu(); }

    @Override
    public Monitor createMonitor() { return new AsusMonitor();}
}
