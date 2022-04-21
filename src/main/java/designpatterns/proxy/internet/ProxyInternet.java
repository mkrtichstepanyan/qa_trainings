package designpatterns.proxy.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("banned.com");
    }

    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access Denied to " + host);
            return;
        }
        internet.connectTo(host);
    }

}

