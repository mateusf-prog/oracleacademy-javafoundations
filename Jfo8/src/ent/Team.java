package ent;

public class Team {
    
    private String name;
    private int countVictories=0;
    private int countLosses=0;
    private int countTie=0;
    private int scoredGoals=0;
    private int goalsConceded=0;

    private String[][] teamDetails;

    public Team(String teamName) {
        this.name = teamName;
        this.teamDetails = new String[2][5];
        teamDetails[0][0] = "--";
        teamDetails[0][1] = "victories";
        teamDetails[0][2] = "losses";
        teamDetails[0][3] = "tie";
        teamDetails[0][4] = "scoredGoals";
        teamDetails[0][5] = "goalsConceded";
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
        this.teamDetails[1][1] = String.valueOf(countVictories);
        }

    public int getCountLosses() {
        return this.countLosses;
    }

    public void setCountLosses() {
        this.countLosses++;
        this.teamDetails[1][2] = String.valueOf(countLosses);
    }

    public int getCountTie() {
        return this.countTie;
    }

    public void setCountTie() {
        this.countTie ++;
        this.teamDetails[1][3] = String.valueOf(countTie);
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int value) {
        this.scoredGoals += value;
        this.teamDetails[1][4] = String.valueOf(scoredGoals);
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int value) {
        this.goalsConceded += value;
        this.teamDetails[1][5] = String.valueOf(goalsConceded);
    }
}
