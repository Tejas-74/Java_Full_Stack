package a1_Basics;
import java.util.Scanner;
public class input {

    //area of circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius  = sc.nextInt();

        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area is:" +area);
    }
}
