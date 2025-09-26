package ex_05_TypeCasting;

public class Lab057_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid syntax - Implicit Type casting - Widening
        int a1 = (int)b; // valid Syntax - Explicit Type casting - Widening
        int a2 = 300;
    //  byte b1 = a2; // invalid Syntax - not possible
        byte b1 =(byte) a2;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b1);
    }
}
