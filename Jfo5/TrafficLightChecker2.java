package Jfo5;

import java.util.Scanner;

public class TrafficLightChecker2 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the color (1: red | 2: green | 3: yellow): ");
        int currentColor = sc.nextInt();

        switch(currentColor) {
        case 1:
            System.out.println("Next color: green"); 
            break;
        case 2:
            System.out.println("Next color: yellow");
            break;
        case 3:
            System.out.println("Next color: red");
            break;
        default:
            System.out.println("Invalid color");
        }

        sc.close();
    }
}