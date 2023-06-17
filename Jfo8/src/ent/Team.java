package ent;

public class Team {
    
    private String name;
    private int countVictories=0;
    private int countLosses=0;
    private int countTie=0;
    private int scoredGoals=0;
    private int goalsConceded=0;

    String[][] teamResults = new String[5][2];

    public Team(String teamName) {
        this.name = teamName;
        this.teamResults[0][0] = "Victories      = ";
        this.teamResults[1][0] = "Losses         = ";
        this.teamResults[2][0] = "Tie            = ";
        this.teamResults[3][0] = "Scored Goals   = ";
        this.teamResults[4][0] = "Conceded Goals = ";

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
        this.teamResults[0][1] = String.valueOf(getCountVictories());
    }

    public int getCountLosses() {
        return this.countLosses;
    }

    public void setCountLosses() {
        this.countLosses++;
        this.teamResults[1][1] = String.valueOf(getCountLosses());
    }

    public int getCountTie() {
        return this.countTie;
    }

    public void setCountTie() {
        this.countTie ++;
        this.teamResults[2][1] = String.valueOf(getCountTie());
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int value) {
        this.scoredGoals += value;
        this.teamResults[3][1] = String.valueOf(getScoredGoals());
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int value) {
        this.goalsConceded += value;
        this.teamResults[4][1] = String.valueOf(getGoalsConceded());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teamResults.length; i++) {
            for (int j = 0; j < teamResults[i].length; j++) {
                if (teamResults[i][j] == null) {
                        teamResults[i][j] = "0";
                }
                sb.append(teamResults[i][j]);
                if (j < teamResults[i].length - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return "Team "
            + getName()
            + "\n"
            + sb.toString();
    }
}

