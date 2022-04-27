package designpatterns.homework_7.AndSargsyan.abstractFactory.factories;

import designpatterns.homework_7.AndSargsyan.abstractFactory.products.gpu.AcerGpu;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.gpu.Gpu;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.manitor.AcerMonitor;
import designpatterns.homework_7.AndSargsyan.abstractFactory.products.manitor.Monitor;

public class AcerFactory extends Company {
    @Override
    public Gpu createGpu() {
        return new AcerGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AcerMonitor();
    }
}
