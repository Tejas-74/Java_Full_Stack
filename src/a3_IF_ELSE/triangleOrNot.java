package a3_IF_ELSE;
import java.util.Scanner;
public class triangleOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Side1: ");
        int a = input.nextInt();

        System.out.println("Enter the Side2: ");
        int b = input.nextInt();

        System.out.println("Enter the Side3: ");
        int c = input.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("This is triangle");
        }else{
            System.out.println("This is not triangle");
        }
    }
}
