package ex_06_Ternary_Operator;

public class Lab067_TO_MaxOf4 {
    public static void main(String[] args) {
        int a = -6;
        int b = 12;
        int c = 2;
        int d = 8;
        int max = (a > b) ? ((a > c) ? ((a > d) ? a : d ) : (c > d ? c : d))
                : ((b > c) ? ((b > d) ? b : d)  : (c > d ? c : d));
        System.out.println(max);
    }
}
