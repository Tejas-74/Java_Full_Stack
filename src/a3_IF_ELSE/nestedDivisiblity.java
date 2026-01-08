package a3_IF_ELSE;
import java.util.Scanner;
public class nestedDivisiblity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num: ");
        int n = input.nextInt();

        if(n % 5 == 0){
            if(n % 3 == 0){
                System.out.println("Num is divisible");
            }else{
                System.out.println("Num is not divisible");
            }
        }else{
            System.out.println("Num is not divisible");
        }
    }
}
