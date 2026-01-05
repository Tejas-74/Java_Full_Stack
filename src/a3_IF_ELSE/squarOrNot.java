package a3_IF_ELSE;
import java.util.Scanner;
public class squarOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Enter lenght: ");
        int lenght = sc.nextInt();

        if(lenght == breadth){
            System.out.println("Its a Square");
        }else{
            System.out.println("Its not a Square");
        }
    }

}
