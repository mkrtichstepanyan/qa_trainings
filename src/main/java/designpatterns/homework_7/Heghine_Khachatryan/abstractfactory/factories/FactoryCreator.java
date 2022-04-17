package designpatterns.homework_7.Heghine_Khachatryan.abstractfactory.factories;

public class FactoryCreator {

    public BankServiceFactory createFactory(String bankService) {
        if (bankService.equalsIgnoreCase("Ararat")) {
            return new AraratBankServiceFactory();
        } else if (bankService.equalsIgnoreCase("Ameria")) {
            return new AmeriaBankServiceFactory();
        } else {
            return null;
        }
    }
}
