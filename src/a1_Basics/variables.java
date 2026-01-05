package a1_Basics;

public class variables {
    public static void main(String[] args) {
        int x;
        x = 5000;
        System.out.println(x);

        x = 4000;
        System.out.println(x); //Updation
        System.out.println(x+450); //addition in variable

        int a;
        a = 200;
        System.out.println(a);
        a = a + 200;    // updation and then addition - a = 200 then put a+200 and then it will give 400
        System.out.println(a);
        a = a - 50;
        System.out.println(a);

        double c = 10;
        double b = 20;
        System.out.println(c + b);
        System.out.println(c - b);
        System.out.println(c * b);
        System.out.println(c / b);

        // cal percentage of 5 subjects

        double x1 = 90;
        double x2 = 91;
        double x3 = 92;
        double x4 = 93;
        double x5 = 94;
        double per = (x1 + x2 + x3 + x4 + x5)/5;
        System.out.println("Total Percentage:" +per);

        // area of circle
        double radius = 25;
        double pi = 3.14;
        double area = radius * radius * pi;
        System.out.println("Area of circle: "+area);

        // cal simmple interest
        double principle, rate, time, si;
        principle = 100;
        rate = 10;
        time = 2;
        si = (principle * rate * time)/100;
        System.out.println(" Simple Interest is:" +si);
    }
}
