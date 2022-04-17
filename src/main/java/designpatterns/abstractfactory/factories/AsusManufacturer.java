
package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.products.gpu.AsusGpu;
import designpatterns.abstractfactory.products.monitor.AsusMonitor;
import designpatterns.abstractfactory.products.gpu.Gpu;
import designpatterns.abstractfactory.products.monitor.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
