package designpatterns.abstractfactory.factories;


import designpatterns.abstractfactory.products.gpu.Gpu;
import designpatterns.abstractfactory.products.monitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
