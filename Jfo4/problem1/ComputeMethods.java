package Jfo4.problem1;

import java.util.Random;

public class ComputeMethods {

    public double fToC(double degreesF) {
        double celsius = 5.0/9 * (degreesF-32);
        return celsius;
    }

    public double hypotenuse(int a, int b) {
        double hypotenuse = Math.sqrt((a * a) + (b * b));
        return hypotenuse;
    }

    public int roll() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1; 
        int dado2 = random.nextInt(6) + 1; 
        int sum = dado1 + dado2;
        return sum;
    }
}
