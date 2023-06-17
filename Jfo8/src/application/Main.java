package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ent.League;
import ent.Match;
import ent.Team;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // instantiating four teams
        Team team1 = new Team("team A");
        Team team2 = new Team("team B");
        Team team3 = new Team("team C");
        Team team4 = new Team("team D");
        List<Team> teams = new ArrayList<Team>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        // instantiating league and add teams in the league
        League league = new League(team1, team2, team3, team4);

        int count = 0;
        int countWeeks = 0;
        
        for (int week=1; week<5; week ++) {
            System.out.println("---- Week " + week + " ----");
            System.out.print("Type the temperature this week: ");
            int temp = sc.nextInt();
            while (temp < 10) {
                count ++;
                countWeeks ++;
                System.out.println("Too cold to play.");
                break;   
            }
            if (countWeeks == 3) {
                System.out.println("Season is over!");
                try {
                    System.out.println(league.matchHistory());
                    System.out.println(league.averageAndMaxTemperature());
                } catch (Exception e) {
                    System.out.println("Nothing result to see!");
                }
                break;
            }
            // creating structure so that a team never plays against itself 
            if (temp >= 10) {
                Team randomTeam1 = teams.get(rd.nextInt(teams.size()));
                Team randomTeam2 = teams.get(rd.nextInt(teams.size()));
                Team randomTeam3 = teams.get(rd.nextInt(teams.size()));
                Team randomTeam4 = teams.get(rd.nextInt(teams.size()));
                while( randomTeam1 == randomTeam2 || randomTeam3 == randomTeam4) {
                    randomTeam1 = teams.get(rd.nextInt(teams.size()));
                    randomTeam3 = teams.get(rd.nextInt(teams.size()));
                }
                // instantiating class Match with two random teams
                Match match = new Match(randomTeam1, randomTeam2, temp);
                Match match2 = new Match(randomTeam3, randomTeam4, temp);
                match.startMatch();
                match2.startMatch();
                System.out.println(match.toString() + "\n");
                System.out.println(match2.toString() + "\n");
                league.addMatchToList(match);
                league.addMatchToList(match2);
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        //
        try {
            System.out.println("--------MATCHES RESULTS------");
            System.out.println(league.matchHistory());
            System.out.println("\n\n" + league.averageAndMaxTemperature());
        } catch (Exception e) {
            System.out.println("Nothing result to see!");
        }
        System.out.println();
        System.out.println();
        System.out.println("--------TEAMS RESULTS------\n");
        for (Team team : teams) {
            System.out.println(team.toString());
        }
        System.out.println();
        System.out.println();

        sc.close();
    }
}

