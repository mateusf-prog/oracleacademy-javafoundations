package ent;

import java.util.ArrayList;
import java.util.List;

public class League{

    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;

    List<Match> matchesHistory = new ArrayList<Match>();

    public League(Team team1, Team team2, Team team3, Team team4) {
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.team4 = team4;
    }

    public String getTeam1() {
        return this.team1.getName();
    }

    public String getTeam2() {
        return this.team2.getName();
    }

    public String getTeam3() {
        return this.team3.getName();
    }

    public String getTeam4() {
        return this.team4.getName();
    }

    public void addMatchToList(Match match) {
        matchesHistory.add(match);
    }

    public String matchHistory() {
        StringBuilder sb = new StringBuilder();
        for (Match match : matchesHistory) {
            sb.append(match);
        }
        return sb.toString();
    }

    public String averageAndMaxTemperature() {
        int averageTemp = 0;
        int maxTemp = Integer.MIN_VALUE;
        for (Match match : matchesHistory) {
            averageTemp += match.getTemperature();
            for (int i=0; i<matchesHistory.size(); i++) {
                if (match.getTemperature() > maxTemp) {
                    maxTemp = match.getTemperature();
                }
            }
        }
        return "Average Temp: "
        + averageTemp / matchesHistory.size()
        + "\nHottest Temp: "
        + maxTemp;
    }
}
