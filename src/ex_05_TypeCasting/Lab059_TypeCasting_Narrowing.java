package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
    //    byte b = val; // Narrowing - Implicit Type casting - not Valid
        byte b = (byte) val; // Narrowing - Explicit Type Casting Valid - data loss

        System.out.println(b);
    }
}
