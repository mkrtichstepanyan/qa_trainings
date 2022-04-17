package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories.FactoryCreator;

public class Main {

    public static void main(String[] args) {
       new FactoryCreator().createFactory("Ararat").loanProvider("salary").provide();
       new FactoryCreator().createFactory("Ararat").depositProvider("comfort").provide();
       new FactoryCreator().createFactory("Ameria").loanProvider("mortgage").provide();
       new FactoryCreator().createFactory("Ameria").depositProvider("standard").provide();
    }
}
