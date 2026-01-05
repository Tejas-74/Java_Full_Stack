package a1_Basics;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        System.out.println(ch);

        int x = (int)ch; // typecasting
        System.out.println(x);
    }
}
