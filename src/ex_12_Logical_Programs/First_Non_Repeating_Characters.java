package ex_12_Logical_Programs;

public class First_Non_Repeating_Characters {
    public static void main(String[] args) {
        String s = "aabbccddeeffgghhiijjkkl";

        for (int i = 0; i < s.length(); i++) {
            Boolean isUnique = true;

            for (int j = 0; j<s.length(); j++){
                if (i!=j && s.charAt(i)==s.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}

