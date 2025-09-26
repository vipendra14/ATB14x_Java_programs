package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 100;
        int a = b;  //Valid Syntax - Widening - Implicit Type Casting - Automatically done
        int a1 = (int)b; // Valid Syntax - Widening - Explicit Type casting - manually done(here not required)

        System.out.println(a);
        System.out.println(a1);
    }
}
