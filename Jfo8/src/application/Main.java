package application;

import java.util.Scanner;

import ent.Team;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Team team1 = new Team("Santos");
        Team team2 = new Team("São Paulo");
        Team team3 = new Team("Corinthians");
        Team team4 = new Team("Flamengo");
        Team team5 = new Team("Palmeiras");

        System.out.print("Type a temperature: ");
        int temperature = sc.nextInt();

        while (temperature < 15) {

        }
    }
}  
