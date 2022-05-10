package designpatterns.homework_7.davit_balabekyan.abstractfactory.factories;

import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.monitor.Monitor;
import designpatterns.homework_7.davit_balabekyan.abstractfactory.products.gpu.Gpu;

public abstract class Company {

    public abstract Gpu createGPU();

    public abstract Monitor createMonitor();
}
