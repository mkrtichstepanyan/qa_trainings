package designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories;

import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.gpu.Gpu;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.gpu.MsiGpu;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.monitor.Monitor;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.monitor.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() { return new MsiGpu(); }
    @Override
    public Monitor createMonitor() { return new MsiMonitor(); }
}
