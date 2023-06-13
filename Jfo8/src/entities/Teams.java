public class Teams {
    
    private String name;
    private int countVictories=0;
    private int countLosses=0;
    private int countTies=0;
    private int scoredGoals=0;
    private int goalsConceded=0;

    private int[][] teamDetails = new int[1][5];

    public Teams(String teamName) {
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

    public int getCountTies() {
        return this.countTies;
    }

    public void setCountTies() {
        this.countTies ++;
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

}

