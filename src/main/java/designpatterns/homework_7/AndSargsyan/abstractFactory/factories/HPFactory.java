package designpatterns.homework_7.AndSargsyan.abstractFactory.factories;

import designpatterns.homework_7.AndSargsyan.abstractFactory.products.gpu.Gpu;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.gpu.HPGpu;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.manitor.HPMonitor;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.manitor.Monitor;

public class HPFactory extends Company {
    @Override
    public Gpu createGpu() {
        return new HPGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new HPMonitor();
    }
}
