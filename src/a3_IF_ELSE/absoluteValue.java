package a3_IF_ELSE;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();

        if(num < 0){
            num = num * (-1);
        }
        System.out.println("Absolute Num is: "+num);
    }
}
