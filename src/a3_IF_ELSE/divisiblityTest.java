package a3_IF_ELSE;
import java.util.Scanner;
public class divisiblityTest {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int num = input.nextInt();

        if(num % 5 == 0){
            System.out.println("5 is divisible by "+num);
        }else{
            System.out.println("5 is not divisible by "+num);
        }
    }
}
//push