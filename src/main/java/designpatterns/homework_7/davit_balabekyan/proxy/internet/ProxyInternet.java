package designpatterns.homework_7.davit_balabekyan.proxy.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("vivaro.am");
        bannedSites.add("adjarabet.am");
        bannedSites.add("totogaming.am");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access denied for " + host);
            return;
        }
        internet.connectTo(host);
    }
}
