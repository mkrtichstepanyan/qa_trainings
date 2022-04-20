package designpatterns.homework_7.anjela_melqonyan.abstractfactory.factory;

import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Gpu;
import designpatterns.homework_7.anjela_melqonyan.abstractfactory.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
