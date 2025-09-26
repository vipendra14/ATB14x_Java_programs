package ex_06_Ternary_Operator;

public class Lab067_TO_MaxOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 1;

        int max = (a>b)?((a>c)? a:c) : ((b>c)? b :c );
        System.out.println(max );
    }


}
