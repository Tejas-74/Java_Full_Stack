package a3_IF_ELSE;
import java.util.Scanner;
public class diviTest {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int num = input.nextInt();

        if(num % 5 == 0 || num % 3 == 0){
            System.out.println("num is divisible by 5 and 3 ");
        }else{
            System.out.println("num is not divisible by 5 and 3 ");
        }
    }
}
//push