package ex_04_Operators;

public class Lab047_OR_AND_Gate {
    public static void main(String[] args) {
        //  || OR Gate
        System.out.println(true || true); // True
        System.out.println(true || false); //True
        System.out.println(false || true); //True
        System.out.println(false || false); //False

        // && AND Gate (only true && true returns true)
        System.out.println(true && true); //True
        System.out.println(true && false); //False
        System.out.println(false && true); //False
        System.out.println(false && false); //False
    }
}
