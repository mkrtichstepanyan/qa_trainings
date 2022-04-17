package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory;

import designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories.FactoryCreator;

public class Main {

    public static void main(String[] args) {
       new FactoryCreator().createFactory("Ararat").loanProvider().provide();
       new FactoryCreator().createFactory("Ararat").depositProvider().provide();
       new FactoryCreator().createFactory("Ameria").loanProvider().provide();
       new FactoryCreator().createFactory("Ameria").depositProvider().provide();
    }
}
