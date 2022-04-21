package designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories;

import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.gpu.AsusGpu;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.gpu.Gpu;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.monitor.AsusMonitor;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.monitor.Monitor;

public class AsusManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
