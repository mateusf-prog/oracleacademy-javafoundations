package Jfo5;

import java.util.Locale;
import java.util.Scanner;

public class ColorRange {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the wavelenght: ");
        double lenght = sc.nextDouble();

        if (lenght >= 380 && lenght < 450) {
            System.out.println("The color is violet");
        } else if (lenght >= 450 && lenght < 495) {
            System.out.println("The color is blue");
        } else if (lenght >= 495 && lenght < 570) {
            System.out.println("The color is green");
        } else if (lenght >= 570 && lenght < 590) {
            System.out.println("The colo is yellow");
        } else if (lenght >= 590 && lenght < 620) {
            System.out.println("The color is orange");
        } else if (lenght >= 620 && lenght <= 750) {
            System.out.println("The color is red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        sc.close();
    }
}
