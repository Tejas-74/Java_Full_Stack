package a2_Operators;
import java.util.Scanner;
public class compundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principle amount: ");
        double principle = input.nextDouble();

        System.out.println("Enter interest rate: ");
        double interrestRate = input.nextDouble();

        System.out.println("Enter time period: ");
        double timePeriod = input.nextDouble();

        double compuandInterest = principle * Math.pow((1 + interrestRate/100), timePeriod);
        System.out.println("Your compuand interest is: " + compuandInterest);
    }
}
