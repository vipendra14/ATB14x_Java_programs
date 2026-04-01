package ex_12_Logical_Programs;

public class Charcater_Occurance {
    public static void main(String[] args) {
        String s = "Programming";
        for(int i = 0; i<= s.length()-1; i++){
            char ch = s.charAt(i);
            System.out.println(ch + ":" + i);
        }
    }
}
