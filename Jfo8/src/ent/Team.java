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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountVictories() {
        return countVictories;
    }

    public void setCountVictories() {
        countVictories++;
    }

    public int getCountLosses() {
        return countLosses;
    }

    public void setCountLosses() {
        countLosses++;
    }

    public int getCountTie() {
        return this.countTie;
    }

    public void setCountTie() {
        countTie ++;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int value) {
        scoredGoals += value;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int value) {
        goalsConceded += value;
    }

    public void saveResultTeams() {
        teamResults[0][0] = "Victories      = ";
        teamResults[1][0] = "Losses         = ";
        teamResults[2][0] = "Tie            = ";
        teamResults[3][0] = "Scored Goals   = ";
        teamResults[4][0] = "Conceded Goals = ";
        teamResults[0][1] = String.valueOf(getCountVictories());
        teamResults[1][1] = String.valueOf(getCountLosses());
        teamResults[2][1] = String.valueOf(getCountTie());
        teamResults[3][1] = String.valueOf(getScoredGoals());
        teamResults[4][1] = String.valueOf(getGoalsConceded());
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

