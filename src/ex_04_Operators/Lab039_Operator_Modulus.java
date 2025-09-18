package ex_04_Operators;

public class Lab039_Operator_Modulus {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a%b);
        // 10 | 20 | 2 - quotient
        //    | 20 |
        //    -------------
        //    0 -Reminder

        System.out.println(13%7);
        // 7 | 13 | 1 -> quotient
        //   | 7  |
        //   ---------
        //   6 - Reminder

        System.out.println(11%2);
        // 2 | 11 | 5 -> quotient
        //   | 10  |
        //   ---------
        //   1 - Reminder

        System.out.println(39%5);
        // 5 | 39 | 7 -> quotient
        //   | 35  |
        //   ---------
        //   4 - Reminder
    }
}
