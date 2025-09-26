package ex_06_Ternary_Operator;

public class Lab066_TO_ODD_EVEN {
    public static void main(String[] args) {
        int a = 13;
        String res = (a %2 ==0)? "even" : "Odd";
        System.out.println(res);
    }
}
