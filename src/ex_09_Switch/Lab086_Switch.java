package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any day of the week");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("non of the day is listed");
        }
    }
}
