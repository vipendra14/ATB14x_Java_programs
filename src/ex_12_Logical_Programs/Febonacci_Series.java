package ex_12_Logical_Programs;

public class Febonacci_Series {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;

        for (int i = 1; i<=num; i++){
            System.out.println(a);
            int next = a+b;
            a = b;
            b = next;

        }
    }
}
