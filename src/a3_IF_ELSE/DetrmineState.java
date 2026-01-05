package a3_IF_ELSE;
import java.util.Scanner;
public class DetrmineState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is zero");
        }
    }
}
