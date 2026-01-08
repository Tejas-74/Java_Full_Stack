package a3_IF_ELSE;
import java.util.Scanner;
public class nested2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int n = input.nextInt();

        if(n % 5 == 0 || n % 3 == 0){
            if(n % 15 != 0){
                System.out.println("Num is divisible by 5 or 3 but not by 15");
            }else{
                System.out.println("Not matching required condition 1");
            }
        }else{
            System.out.println("Not matching required condition 2");
        }
    }
}

// if(n % 5 == 0 || n % 3 == 0 && n % 15 != 0)
// if((n % 5 == 0 || n % 3 == 0) && n % 15 != 0)   try this and remember why,
// hint - think about operators precedence