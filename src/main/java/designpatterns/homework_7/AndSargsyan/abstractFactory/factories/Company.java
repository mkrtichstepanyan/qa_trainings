package designpatterns.homework_7.AndSargsyan.abstractFactory.factories;

import designpatterns.homework_7.AndSargsyan.abstractFactory.products.gpu.Gpu;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.manitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
