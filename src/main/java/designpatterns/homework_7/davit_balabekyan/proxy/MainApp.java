package designpatterns.homework_7.davit_balabekyan.proxy;

import designpatterns.homework_7.davit_balabekyan.proxy.internet.Internet;
import designpatterns.homework_7.davit_balabekyan.proxy.internet.ProxyInternet;
import designpatterns.homework_7.davit_balabekyan.proxy.video.ProxyVideoDownloader;
import designpatterns.homework_7.davit_balabekyan.proxy.video.VideoDownloader;

public class MainApp {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("facebook.com");
        internet.connectTo("vivaro.am");

        System.out.println("================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("lombok");
        videoDownloader.getVideo("tutorial");
        videoDownloader.getVideo("tutorial");
        videoDownloader.getVideo("lombok");
        videoDownloader.getVideo("tutorial");
    }
}
