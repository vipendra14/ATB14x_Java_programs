package ex_12_Logical_Programs;

public class Palindrom_Number {

    public static void main(String[] args) {
        int num  = 121;
        int  original = num;
        int rev = 0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        if(original == rev){
            System.out.println(original + " is palindrome Number" +
                    "");
        }
        else {
            System.out.println(original +"Number is not palindrome");
        }

    }
}
