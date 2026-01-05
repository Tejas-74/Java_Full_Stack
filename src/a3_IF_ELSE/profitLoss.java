package a3_IF_ELSE;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SP: ");
        int sp = sc.nextInt();

        System.out.println("Enter CP: ");
        int cp = sc.nextInt();

        if(sp > cp){
            System.out.println("You are in Profit");
            System.out.println("Your Profit is: "+(sp-cp)); // sp-sp = profit
        }else if(sp < cp){
            System.out.println("You are in Loss");
            System.out.println("Your Loss is: "+(cp-sp)); // cp-sp = loss
        }
    }
}
