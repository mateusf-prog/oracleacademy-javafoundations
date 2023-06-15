package ent;

import java.util.Random;

public class Team {
    
    private String name;
    private int countVictories=0;
    private int countLosses=0;
    private int countTie=0;
    private int scoredGoals=0;
    private int goalsConceded=0;

    public Team(String teamName) {
        this.name = teamName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountVictories() {
        return this.countVictories;
    }

    public void setCountVictories() {
        this.countVictories++;
    }

    public int getCountLosses() {
        return this.countLosses;
    }

    public void setCountLosses() {
        this.countLosses++;
    }

    public int getCountTie() {
        return this.countTie;
    }

    public void setCountTie() {
        this.countTie ++;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int value) {
        this.scoredGoals += value;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int value) {
        this.goalsConceded += value;
    }

    public String toString() {
        Random random = new Random();
        return getName()
            + "\nWins: " 
            + getCountVictories()
            + ", Losses: "
            + getCountLosses()
            + ", Tie: "
            + getCountTie()
            + "\nPoints Scored: "
            + random.nextInt(3, 9)
            + ", Points allowed: "
            + random.nextInt(2, 8)
            + "\n\n";
    }
}
