package a2_Operators;

public class Unary {
    public static void main(String[] args) {

        // ' - '
        int a = 5;
        int b = -a;
        int c = -b;
        System.out.println(c);

        // ' ++ '
        int e = 5;
        e = e + 1;
        System.out.println(e);
        e++;
        System.out.println(e);
        ++a;
        System.out.println(e);
        e = e +1;
        System.out.println(e);

        // ' -- '
        int p = 10;
        System.out.println(p--);
        System.out.println(p);

        System.out.println(--p);
        System.out.println(p);

    }
}
