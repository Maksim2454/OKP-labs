package org.example;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, String genre, int rating, String platform) {
        super(name, genre, rating);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public void play() {
        System.out.println("Играем на компьютере");
    }

    public void saveGame() {
        System.out.println("Сохраняем игру");
    }
}