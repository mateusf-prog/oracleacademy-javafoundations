package ent;


import java.util.Random;

public class Match {
    
    private int id=0;
    private int temperature;
    private Team team1;
    private Team team2;
    private String result;

    public Match(Team team1, Team team2, int temperature) {
        Random random = new Random();
        this.id = random.nextInt(9999);
        this.team1 = team1;
        this.team2 = team2;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void startMatch() {
        int team1Goals=0, team2Goals=0;
        Random random = new Random();
        if (temperature < 25) {
            team1Goals = random.nextInt(0, 2);
            team2Goals = random.nextInt(0, 2);
            this.team1.setScoredGoals(team1Goals);
            this.team1.setGoalsConceded(team2Goals);
            this.team2.setScoredGoals(team2Goals);
            this.team2.setGoalsConceded(team1Goals);
            if (team1Goals > team2Goals) {
                this.team1.setCountVictories();
                this.team2.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else if (team2Goals > team1Goals) {
                this.team2.setCountVictories();
                this.team1.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else {
                this.team1.setCountTie();
                this.team2.setCountTie();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }
        } else if (temperature < 50) {
            team1Goals = random.nextInt(0, 5);
            team2Goals = random.nextInt(0, 5);
            this.team1.setScoredGoals(team1Goals);
            this.team1.setGoalsConceded(team2Goals);
            this.team2.setScoredGoals(team2Goals);
            this.team2.setGoalsConceded(team1Goals);
            if (team1Goals > team2Goals) {
                this.team1.setCountVictories();
                this.team2.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else if (team2Goals > team1Goals) {
                this.team2.setCountVictories();
                this.team1.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else {
                this.team1.setCountTie();
                this.team2.setCountTie();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }
        } else if (temperature < 80) {
            team1Goals = random.nextInt(0, 9);
            team2Goals = random.nextInt(0, 9);
            this.team1.setScoredGoals(team1Goals);
            this.team1.setGoalsConceded(team2Goals);
            this.team2.setScoredGoals(team2Goals);
            this.team2.setGoalsConceded(team1Goals);
            if (team1Goals > team2Goals) {
                this.team1.setCountVictories();
                this.team2.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " "  + team2.getName();
            } else if (team2Goals > team1Goals) {
                this.team2.setCountVictories();
                this.team1.setCountLosses();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " "  + team2.getName();
            } else {
                this.team1.setCountTie();
                this.team2.setCountTie();
                result = team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }       
        }
    }


    public String toString(){
        return "\n\nID of match: " 
            + id
            + "\nTemperature: "
            + temperature
            + "\nResult: "
            + result;
    }
}