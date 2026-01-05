package a2_Operators;
import java.util.Scanner;
public class floatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num1: ");
        double num1 = input.nextDouble();
        System.out.println("Enter a num2: ");
        double num2 = input.nextDouble();

        double mul = num1 * num2;
        System.out.println("Answer is: " + mul);

        System.out.println("Result is: " + num1 * num2);
        System.out.println("Result is: " + num1 + num2); // following precedence left to right

    }
}
