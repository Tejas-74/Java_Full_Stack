package a1_Basics;

public class HW {
    public static void main(String[] args) {
        int i = 2, j = 3, k ,l;
        double a, b;

        k = i / j + j; //3
        l = j / i + i; //3
        a = i / j * j; //0.0
        b = j / i * i; //2.0
        System.out.println(k+ " "+l+" "+a+ " "+b);
    }
}
