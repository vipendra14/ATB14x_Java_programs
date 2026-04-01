package ex_12_Logical_Programs;

public class Compare_Char {
    public static void main(String[] args) {
        String s1 = "ABBCDE";
        String s2 = "ABCD";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    s2.charAt(j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(ch);
            }
        }
    }
}
