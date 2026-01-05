package a2_Operators;
import java.util.Scanner;
public class areaTraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height: ");
        int height = input.nextInt();
        System.out.println("Enter Base: ");
        int base = input.nextInt();
        double Area = 0.5 * height * base;
        System.out.println("Area = " + Area);
    }
}
