package com.designpattern.structural.facade;

import java.util.*;

// Subsystem components
class AudioPlayer {
    void playAudio(String filename) {
        System.out.println("Playing audio file: " + filename);
    }
}

class VideoPlayer {
    void playVideo(String filename) {
        System.out.println("Playing video file: " + filename);
    }
}

class ImageLoader {
    void loadImage(String filename) {
        System.out.println("Loading image file: " + filename);
    }
}

// Facade class
class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private ImageLoader imageLoader;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
        this.imageLoader = new ImageLoader();
    }

    void playMedia(String filename, String mediaType) {
        if (mediaType.equals("audio")) {
            audioPlayer.playAudio(filename);
        } else if (mediaType.equals("video")) {
            videoPlayer.playVideo(filename);
        } else if (mediaType.equals("image")) {
            imageLoader.loadImage(filename);
        } else {
            System.out.println("Unsupported media type: " + mediaType);
        }
    }
}

// Client code using the facade
public class Main {
    public static void main(String[] args) {
        MultimediaFacade facade = new MultimediaFacade();

        // Playing audio
        facade.playMedia("song.mp3", "audio");

        // Playing video
        facade.playMedia("movie.mp4", "video");

        // Loading image
        facade.playMedia("picture.jpg", "image");

        // Unsupported media type
        facade.playMedia("unknown.file", "unknown");
    }
}