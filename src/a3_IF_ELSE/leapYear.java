package a3_IF_ELSE;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = input.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Year is Leap");
        } else {
            System.out.println("Year is not Leap");
        }

    }
}
//push
