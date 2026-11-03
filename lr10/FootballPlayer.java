package org.example;

public class FootballPlayer implements Athlete, TeamPlayer {
    private String name;
    private String team;
    private int goals;

    public FootballPlayer(String name, String team, int goals) {
        this.name = name;
        this.team = team;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public void train() {
        System.out.println(name + " тренирует удары по воротам");
    }

    @Override
    public void compete() {
        System.out.println(name + " играет матч");
    }

    @Override
    public String getResults() {
        return "Голов: " + goals;
    }

    @Override
    public void playWithTeam() {
        System.out.println(name + " играет в команде " + team);
    }

    @Override
    public String getTeam() {
        return team;
    }
}