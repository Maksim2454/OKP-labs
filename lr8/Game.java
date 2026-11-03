package org.example;

public class Game {
    private String name;
    private String genre;
    private int rating;

    public Game(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void play() {
        System.out.println("Играем в игру");
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
    }
}