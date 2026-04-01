package ex_12_Logical_Programs;

public class Compare_Strings {
    public static void main(String[] args) {
        String s1 = "VIPENDRA'";
        String s2 = "VIPENDRA";

        if (s1.equals(s2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
