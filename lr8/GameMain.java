package org.example;

public class GameMain {
    public static void main(String[] args) {
        Game[] games = new Game[5];

        games[0] = new BoardGame("Монополия", "Экономическая", 8, 4);
        games[1] = new BoardGame("Шахматы", "Логическая", 9, 2);
        games[2] = new BoardGame("Каркассон", "Стратегия", 7, 5);
        games[3] = new VideoGame("Ведьмак 3", "RPG", 10, "PC");
        games[4] = new VideoGame("Minecraft", "Песочница", 9, "PC");

        for (int i = 0; i < games.length; i++) {
            System.out.println(" Игра №" + (i + 1) + " ");
            games[i].displayInfo();
            games[i].play();
            System.out.println();
        }

        System.out.println("Уникальные методы");

        BoardGame board = new BoardGame("Монополия", "Экономическая", 8, 4);
        board.rollDice();

        VideoGame video = new VideoGame("Ведьмак 3", "RPG", 10, "PC");
        video.saveGame();
    }
}