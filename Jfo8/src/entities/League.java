import java.util.ArrayList;
import java.util.List;

public class League{

    private Teams team1;
    private Teams team2;
    private Teams team3;
    private Teams team4;

    List<Match> matchHistory = new ArrayList<Match>();

    public League(Teams team1, Teams team2, Teams team3, Teams team4) {
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

    

}
