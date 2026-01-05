package a2_Operators;
import java.util.Scanner;
public class perimeterRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter all all sides of rectangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        double side4 = input.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;
        System.out.println("perimeter = " + perimeter);
    }
}
