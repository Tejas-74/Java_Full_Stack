package a2_Operators;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your principle amount: ");
        double p = input.nextDouble();

        System.out.println("Please enter your interest rate: ");
        double r = input.nextDouble();

        System.out.println("For how many years you are borrowing: ");
        double t = input.nextDouble();

        double si = (p * t * r) / 100;
        System.out.println("Your interest is: " + si);
    }
}
