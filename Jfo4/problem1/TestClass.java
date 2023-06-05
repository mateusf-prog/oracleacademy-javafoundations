package Jfo4.problem1;

public class TestClass {
    public static void main(String args[]) {

        ComputeMethods computeMethods = new ComputeMethods();

        System.out.println("Temp in celsius " + computeMethods.fToC(90));
        System.out.println("Hypotenuse is " + computeMethods.hypotenuse(300, 100));
        System.out.println("The sum of the dice values is " + computeMethods.roll());
    }
}
