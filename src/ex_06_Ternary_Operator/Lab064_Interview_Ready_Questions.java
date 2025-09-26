package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Questions {
    public static void main(String[] args) {
        int age = 33;
        String res = (age > 20)? (age > 40 ? "you can have sex" : "can sleep with boyfried"): "no";
        System.out.println(res);
    }
}
