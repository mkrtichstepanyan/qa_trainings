package designpatterns.homework_7.AndSargsyan.factory.factoryMyVersion.tea;

public class TeaFactory {

    public Tea getTea(TeaType type) {
        Tea toReturn = null;
        switch (type) {
            case Green:
                toReturn = new GreenTea();
                break;
            case Lemon:
                toReturn = new LemonTea();
                break;
            case Cherry:
                toReturn = new CherryTea();
                break;
            default:
                throw new IllegalArgumentException("Wrong tea type: "+ type);
        }
        return toReturn;
    }
}
