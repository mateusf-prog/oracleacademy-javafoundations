package Jfo6;

import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose a number: ");
        int num = sc.nextInt();

        for (int i=1; i<13; i++) {
            System.out.printf("%d x " + i + " = %d%n", num, (num*i));
        }

        sc.close();
    }
}
