package designpatterns.homework_7.AndSargsyan.factory.factoryMyVersion.tea;

public class TeaDemo {
    public static void main(String[] args) {
        TeaFactory teaFactory = new TeaFactory();

        Tea green = teaFactory.getTea(TeaType.Green);
        Tea cherry = teaFactory.getTea(TeaType.Cherry);
        Tea lemon = teaFactory.getTea(TeaType.Lemon);

        green.orderTea();
        cherry.orderTea();
        lemon.orderTea();
    }
}
