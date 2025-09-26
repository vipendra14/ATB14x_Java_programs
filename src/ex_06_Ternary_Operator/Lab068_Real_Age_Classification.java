package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 61;
        String result = (age < 18 ) ? "Minor" : (age <= 60) ? "Adult" : "Senior_Citizen" ;
        System.out.println(result);
    }
}
