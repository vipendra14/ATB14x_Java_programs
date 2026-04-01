package ex_12_Logical_Programs;

public class Second_Minimum {
    public static void main(String[] args) {
        int[] Array = {112, 34, 53, 281, 300, 25, 22, 18};
        int minimum = Integer.MAX_VALUE;
        int secondminimum = Integer.MAX_VALUE;

        for (int num : Array){
            if(num < minimum){
                secondminimum =  minimum;
              minimum = num;
            }
            else if (num < secondminimum && num != minimum) {
                secondminimum = num;

            }
        }
        System.out.println(minimum + " is the minium number");
        System.out.println(secondminimum + " is the second minimum value");
    }
}
