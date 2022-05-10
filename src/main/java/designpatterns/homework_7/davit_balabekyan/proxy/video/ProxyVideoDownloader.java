package designpatterns.homework_7.davit_balabekyan.proxy.video;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {

    private final Map<String, Video>  videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)){
            videoCache.put(videoName,downloader.getVideo(videoName));
        }
        System.out.println("Retrieving video from cache... ");
        System.out.println("--------------------");
        return videoCache.get(videoName);
    }
}
