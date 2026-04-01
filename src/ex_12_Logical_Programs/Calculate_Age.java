package ex_12_Logical_Programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calculate_Age {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of Birth in YYYY MM DD format");
        String dobInput = sc.nextLine();

        LocalDate dob = LocalDate.parse(dobInput);
        LocalDate today = LocalDate.now();

        Period age = Period.between(dob,today);
        System.out.println("Current age is");
        System.out.println(age.getYears() + " Years " + age.getMonths() +
                " Month " + age.getDays() + " date " );

    }
}
