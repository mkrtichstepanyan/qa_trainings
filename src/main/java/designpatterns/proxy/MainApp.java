package designpatterns.proxy;

import designpatterns.proxy.internet.Internet;
import designpatterns.proxy.internet.ProxyInternet;
import designpatterns.proxy.video.ProxyVideoDownloader;
import designpatterns.proxy.video.VideoDownloader;

public class MainApp {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("====================================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}
