package a3_IF_ELSE;
import java.util.Scanner;
public class younger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age detector");

        System.out.println("Enter the age of rahul: ");
        int rahul = input.nextInt();

        System.out.println("Enter the age of tejas: ");
        int tejas = input.nextInt();


        System.out.println("Enter the age of sam: ");
        int sam = input.nextInt();

        if(rahul < tejas && rahul < sam){
            System.out.println("Rahul is Younger than tejas and sam");
        }else if(tejas < sam){
            System.out.println("tejas is Younger than rahul and sam");
        }else{
            System.out.println("sam is Younger than tejas and rahul");
        }

    }
}
