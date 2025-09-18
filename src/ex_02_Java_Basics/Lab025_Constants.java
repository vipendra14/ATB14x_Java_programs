package ex_02_Java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 100;
        a = 101;
        System.out.println(a);

        final int b = 201;
//        b = 200;  Cannot assign a value to final variable 'b'
        final char c= 'z';
        final float f = 101l;


    }
}
