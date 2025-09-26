package ex_04_Operators;

public class Lab042_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 203;
        // + -> String (Concatenation is only used for String and + is the sign )
        String F_name = "Vipendra";
        String L_name = "Mishra";
        System.out.println(a+b);
        System.out.println(F_name + L_name + a+b);
        System.out.println(a+b + F_name + L_name);
        System.out.println(a+b + F_name + b+a + L_name);
        System.out.println(F_name + a+b + L_name);

    }
}
