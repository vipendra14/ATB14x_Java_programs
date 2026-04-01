package ex_12_Logical_Programs;

public class First_Non_Repeating_Char {

    public static void main(String [] args){

        String s = "aabbccddeeffgghhiijjkkl";

        for(int i =0; i<s.length(); i++){

            char ch = s.charAt(i);
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }
    }


}
