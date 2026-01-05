package a3_IF_ELSE;
import java.util.Scanner;
public class percentage {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int per = input.nextInt();

        if(per >= 90){
            System.out.println("Your Grade is A");
        }else if(per >= 75){
            System.out.println("Your Grade is B");
        }else if(per >= 60){
            System.out.println("Your Grade is C");
        }else if(per >= 30){
            System.out.println("Your Grade is D");
        }else{
            System.out.println("Your are failed");
        }
    }
}
//push