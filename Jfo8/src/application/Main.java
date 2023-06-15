package application;

import java.util.Scanner;

import ent.League;
import ent.Match;
import ent.Team;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Team team1 = new Team("Santos");
        Team team2 = new Team("São Paulo");
        Team team3 = new Team("Corinthians");
        Team team4 = new Team("Flamengo");

        League league = new League(team1, team2, team3, team4);
        
        System.out.print("Type the temperature: ");
        int temperature = sc.nextInt();
        int count = 1;

        if (temperature < 10) {
            while (temperature < 10) {
                System.out.println("Too cold to play.");
                System.out.print("Type the temperature: ");
                temperature = sc.nextInt();
                count ++;
                if (count == 3) {
                    System.out.println("Season is over");
                    System.out.println("----------results----------");
                    league.teamResults(team1, team2, team3, team4);
                    System.out.println();
                    System.out.println();
                    System.out.println(league.matchHistory());
                    System.out.println();
                    System.out.println(league.averageAndMaxTemperature());
                }
            }
        }

        Match match1 = new Match(team1, team2, temperature);
        match1.startMatch();
        league.addMatchToList(match1);
        Match match2 = new Match(team2, team3, temperature);
        match2.startMatch();
        league.addMatchToList(match2);
        Match match3 = new Match(team4, team1, temperature);
        match3.startMatch();
        league.addMatchToList(match3);
        Match match4 = new Match(team2, team4, temperature);
        match4.startMatch();
        league.addMatchToList(match4);

        System.out.println();
        System.out.println();
        league.teamResults(team1, team2, team3, team4);
        System.out.println();
        System.out.println();
        System.out.println(league.matchHistory());
        System.out.println();
        System.out.println(league.averageAndMaxTemperature());


        sc.close();
    }
} 
