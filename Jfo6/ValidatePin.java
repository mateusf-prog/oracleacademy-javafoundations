package Jfo6;

import java.util.Scanner;

public class ValidatePin {
    public static void main(String aString[]) {

        Scanner sc = new Scanner(System.in);

        int PIN = 8613;

        System.out.print("Enter PIN: ");
        int typedPin = sc.nextInt();

        while (true) {
            if (typedPin != PIN) {
                System.out.print("Incorret PIN. Try again: ");
                typedPin = sc.nextInt();
            } else {
                System.out.println("Correct PIN! Welcome to your account!");
                break;
            }
            sc.close();
        }
    }
}
