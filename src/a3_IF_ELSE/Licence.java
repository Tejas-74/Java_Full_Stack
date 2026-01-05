package a3_IF_ELSE;
import java.util.Scanner;
public class Licence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Licence Dept");

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18){
            System.out.println("You are eligible for applying licence");
        }
        else {
            System.out.println("You are not eligible for applying licence");
        }
    }
}
