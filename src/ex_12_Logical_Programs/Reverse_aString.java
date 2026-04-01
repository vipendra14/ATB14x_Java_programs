package ex_12_Logical_Programs;

public class Reverse_aString {
    public static void main(String[] args) {
        String s = "Hello you are a good boy";
        String r = "";
        for(int i = 0; i< s.length(); i++ ){
            r = s.charAt(i) + r;
        }
        System.out.println(s.length());
        System.out.println(r);
    }
}
