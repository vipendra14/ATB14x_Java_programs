package ex_05_TypeCasting;

public class Lab060_Type_Casting {
    public static void main(String[] args) {
        long phno = 9900768701l;
    //  short s = phno; // Narrowing - implicit type casting - not valid
        short s = (short)phno;  // Narrowing - Explicit type casting - valid - but data loss

        System.out.println(s);
    }
}
