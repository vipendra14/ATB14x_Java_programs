package ex_04_Operators;

public class Lab041_Logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean b1 = false;
        System.out.println(!b1);

        boolean c = true || false;
        System.out.println(c);

        boolean c1 = false && true;
        System.out.println(c1);
    }
}
