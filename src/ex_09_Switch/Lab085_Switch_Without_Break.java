package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values between 1 to 7");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Day 1");
                break;
            case 2:
                System.out.println("Day 2");
            case 3 :
                System.out.println("Day 3");
            case 4 :
                System.out.println("Day 4");
            case 5:
                System.out.println("Day 5");
            case 6:
                System.out.println("Day 6");
            case 7:
                System.out.println("Day 7");
            default:
                System.out.println("Non of these days are listed");
        }
    }
}
