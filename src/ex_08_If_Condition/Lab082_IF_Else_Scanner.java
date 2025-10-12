package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_IF_Else_Scanner {
    public static void main(String[] args) {

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Options
        //
        //  int age = Integer.parseInt(args[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired value");
        int age = sc.nextInt();
        System.out.println(age);
    }
}
