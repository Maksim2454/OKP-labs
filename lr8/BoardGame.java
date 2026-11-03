package org.example;

public class BoardGame extends Game {
    private int players;

    public BoardGame(String name, String genre, int rating, int players) {
        super(name, genre, rating);
        this.players = players;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    @Override
    public void play() {
        System.out.println("Играем за столом");
    }

    public void rollDice() {
        System.out.println("Бросаем кубик");
    }

}