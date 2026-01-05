package a2_Operators;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {

        // swapingnumber
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value A of: ");
        int a = sc.nextInt();

        System.out.println("Enter value B of: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping Done");
        System.out.println("Enter value A of: "+a);
        System.out.println("Enter value B of: "+b);
    }
}
