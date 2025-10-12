package ex_02_Java_Basics;

public class Assessment_Assignment_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println((a > b) && (a > 0));
        System.out.println((a < b) || (a > 0));
        System.out.println(!(a > b));
    }
}
