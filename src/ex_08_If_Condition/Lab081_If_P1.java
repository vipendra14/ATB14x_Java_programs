package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[3]);
        if (age > 25)
            System.out.println("Yes you are independent");
        else
            System.out.println("You are not");
    }
}
