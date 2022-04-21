package designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories;

import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.gpu.Gpu;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.gpu.MsiGpu;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.monitor.Monitor;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.monitor.MsiMonitor;

public class MsiManufacturer extends  Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
