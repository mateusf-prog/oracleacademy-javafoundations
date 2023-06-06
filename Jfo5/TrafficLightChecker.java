package Jfo5;

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the color (1: red | 2: green | 3: yellow): ");
        int currentColor = sc.nextInt();

        if (currentColor == 1) {
            System.out.println("Next color: green");
        }
        else if (currentColor == 2) {
            System.out.println("Next color: yellow");
        }
        else if (currentColor == 3) {
            System.out.println("Next color: red");
        }
        else {
            System.out.println("invalid color!");
        }
        
        sc.close();
    }
    
}
