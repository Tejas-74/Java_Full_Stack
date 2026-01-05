package a3_IF_ELSE;
import java.util.Scanner;
public class threeDigitNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();

        if(num > 99 && num < 1000){
            System.out.println("Its a digit Number");
        }else{
            System.out.println("Its not a digit Number");
        }
    }
}
