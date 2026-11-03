package org.example;

public class SportsmanMain {
    public static void main(String[] args) {
        Athlete[] athletes = new Athlete[5];

        athletes[0] = new FootballPlayer("Иван", "Динамо", 10);
        athletes[1] = new FootballPlayer("Пётр", "БАТЭ", 7);
        athletes[2] = new FootballPlayer("Сергей", "Шахтёр", 15);
        athletes[3] = new Swimmer("Анна", "Волна", 3);
        athletes[4] = new Swimmer("Мария", "Аква", 5);

        for (int i = 0; i < athletes.length; i++) {
            System.out.println("Спортсмен №" + (i + 1));
            athletes[i].train();
            athletes[i].compete();
            System.out.println(athletes[i].getResults());
            System.out.println();
        }

        System.out.println("Командные игроки:");

        TeamPlayer[] teamPlayers = new TeamPlayer[5];

        teamPlayers[0] = new FootballPlayer("Иван", "Динамо", 10);
        teamPlayers[1] = new FootballPlayer("Пётр", "БАТЭ", 7);
        teamPlayers[2] = new FootballPlayer("Сергей", "Шахтёр", 15);
        teamPlayers[3] = new Swimmer("Анна", "Волна", 3);
        teamPlayers[4] = new Swimmer("Мария", "Аква", 5);

        for (int i = 0; i < teamPlayers.length; i++) {
            teamPlayers[i].playWithTeam();
            System.out.println("Команда: " + teamPlayers[i].getTeam());
        }
    }
}