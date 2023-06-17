package ent;

import java.util.Random;

public class Match {
    
    private int id=0;
    private int temperature;
    private Team team1;
    private Team team2;

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

    public String startMatch() {
        int team1Goals=0, team2Goals=0;
        Random random = new Random();
        if (temperature > 10 &&  temperature < 25) {
            team1Goals = random.nextInt(0, 2);
            team2Goals = random.nextInt(0, 2);
            if (team1Goals > team2Goals) {
                team1.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else if (team2Goals > team1Goals) {
                team2.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else {
                team1.setCountTie();
                team2.setCountTie();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }
        } else if (temperature > 25 &&  temperature < 50) {
            team1Goals = random.nextInt(0, 5);
            team2Goals = random.nextInt(0, 5);
            if (team1Goals > team2Goals) {
                team1.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else if (team2Goals > team1Goals) {
                team2.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            } else {
                team1.setCountTie();
                team2.setCountTie();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }
        } else {
            team1Goals = random.nextInt(0, 9);
            team2Goals = random.nextInt(0, 9);
            if (team1Goals > team2Goals) {
                team1.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " "  + team2.getName();
            } else if (team2Goals > team1Goals) {
                team2.setCountVictories();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " "  + team2.getName();
            } else {
                team1.setCountTie();
                team2.setCountTie();
                team1.setScoredGoals(team1Goals);
                team1.setGoalsConceded(team2Goals);
                team2.setScoredGoals(team2Goals);
                team2.setGoalsConceded(team1Goals);
                return team1.getName() + " " + team1Goals + " x " + team2Goals + " " + team2.getName();
            }       
        }
    }

    public String toString(){
        return "\n\nID of match: " 
            + id
            + "\nTemperature: "
            + temperature
            + "\nResult: "
            + startMatch();
    }
}