package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int fees = 500;
        float tax = 53.23f;
     // int total = (fees+tax); // Narrowing - implicit - Not valid
        int total = fees+(int)tax; // Narrowing - Explicit - Valid - Data loss
        System.out.println(total);

        float total1 = fees + tax; // Widening - implicit
        System.out.println(total1);

        float total2 = (float)tax+fees; // Widening - Explicit
        System.out.println(total2);
    }
}
