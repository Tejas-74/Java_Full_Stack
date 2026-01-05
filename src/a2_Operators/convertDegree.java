package a2_Operators;
import java.util.Scanner;
public class convertDegree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter degree in fahrenheit :");
        int f = input.nextInt();

        int c = (f - 32) * 5 / 9;
        System.out.println("Your Degreein Celcius Is: " +c);
    }
}
