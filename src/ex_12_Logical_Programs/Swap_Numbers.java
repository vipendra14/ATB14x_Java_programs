package ex_12_Logical_Programs;

public class Swap_Numbers {
    // Swap two numbers without using third variable
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a+b;
        b = a-b;

        a = a-b;
        System.out.println("Initially value of a was 10, now value has been updated to "+a);
        System.out.println("Initially value of b was 20, now value has been updated to "+b);
    }
}
