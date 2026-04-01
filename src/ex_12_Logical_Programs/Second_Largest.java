package ex_12_Logical_Programs;

public class Second_Largest {
    public static void main(String[] args) {
        int[] Array = {112, 34, 53, 281, 300, 25, 22, 18};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int num : Array) {
            if (num > largest){
                secondlargest = largest;
                largest = num;
            }
            else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }

            if (num < smallest ){
                secondsmallest = smallest;
                smallest = num;

            } else if (num < secondsmallest && num!=smallest) {
                secondsmallest = num;

            }
        }
        System.out.println(secondlargest +" is the second larget number");
        System.out.println(largest +" is the largest number");
        System.out.println(secondsmallest +" is the second smallest number");
        System.out.println(smallest +" is the smallest number");
    }
}
