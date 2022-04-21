package designpatterns.homework_7.Lilit_Manukyan.abstractFactory.factories;

import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.gpu.Gpu;
import designpatterns.homework_7.Lilit_Manukyan.abstractFactory.pproducts.monitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
