package designpatterns.homework_7.davit_balabekyan.proxy.internet;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String host) {
        System.out.println("Successfully opened connection to " + host);
    }
}
