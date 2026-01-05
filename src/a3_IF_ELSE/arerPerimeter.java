package a3_IF_ELSE;
import java.util.Scanner;
public class arerPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Enter lenght: ");
        int lenght = sc.nextInt();

        int area = lenght * breadth;
        int perimeter = 2 * (lenght + breadth);

        if(area > perimeter){
            System.out.println("Area is Greater than Perimeter");
        }else{
            System.out.println("Perimeter is Greater than Area");
        }
    }

}
//push