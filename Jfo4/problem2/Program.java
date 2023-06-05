package Jfo4.problem2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = sc.nextLine();

        int index = name.lastIndexOf(' ');
        String firstName = name.substring(0, index);
        String lastName = name.substring(index + 1);

        System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0) + ".");

        sc.close();
    }
}
