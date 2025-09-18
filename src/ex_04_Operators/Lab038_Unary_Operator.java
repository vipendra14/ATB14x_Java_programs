package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        // Unary Operator
        int a = +10;
        int b = -21;
        int result = a+b;

        int x = 2;
        int y = 3;

        int c = -1;
        c = c+1;
        System.out.println(x++ + ++x + y++ + ++y + y--);
        System.out.println( 2   + 4  + 3   +  5   + 5);
        System.out.println(c);
        System.out.println(result);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(++y);
        System.out.println(y++);
        System.out.println(--y);
        System.out.println(y--);
        System.out.println(2 + 4 + 3 + 5 + 5);


    }
}
