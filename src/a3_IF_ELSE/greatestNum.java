package a3_IF_ELSE;
import java.util.Scanner;
public class greatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = input.nextInt();

        System.out.println("Enter Num3: ");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1+" num1 is greatest number");
        } else if(num2 >= num3){
            System.out.println(num2+" num2 is greatest number");
        }else{
            System.out.println(num3+" num3 is greatest number");
        }
    }
}
