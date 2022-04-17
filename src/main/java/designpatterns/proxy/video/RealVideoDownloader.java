package designpatterns.proxy.video;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading Video");
        System.out.println("Retrieving Video Metadata");
        return new Video(videoName);
    }

}
