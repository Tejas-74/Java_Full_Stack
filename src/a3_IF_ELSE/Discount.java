package a3_IF_ELSE;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Onborading");

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Are you Female (true/false?)");
        boolean isFemale = input.nextBoolean();

        if (age < 5){
            System.out.println("You got discout of 75% ");
        } else if (isFemale) {
            System.out.println("You got Discount of 50%");
        } else if (age > 60 && isFemale) {
            System.out.println("You got no Discount");
        }
    }
}
