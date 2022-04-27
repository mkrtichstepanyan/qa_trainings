package designpatterns.homework_7.davit_balabekyan.proxy.video;

public class RealVideoDownloader implements VideoDownloader{

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading video");
        System.out.println("Retrieving video metadata");
        return new Video(videoName);
    }
}
