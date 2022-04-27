package designpatterns.homework_7.Hayk_Davtyan.abstractfactory.factories;

import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.gpu.Gpu;
import designpatterns.homework_7.Hayk_Davtyan.abstractfactory.products.monitor.Monitor;

public abstract class Company{
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
