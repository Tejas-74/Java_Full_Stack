package a3_IF_ELSE;
import java.util.Scanner;
public class ageDetector {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("You are Child");
        }else if(age <= 20){
            System.out.println("You are Teenager");
        }else if(age <= 60){
            System.out.println("You are an Adult");
        }else if(age > 60){
            System.out.println("You are Senior");
        }
    }
}
//push