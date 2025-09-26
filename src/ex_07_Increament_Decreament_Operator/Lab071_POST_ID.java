package ex_07_Increament_Decreament_Operator;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // Pre Increment

        // Post Increament -> print first and then increase

        int a_post = 20;
        int b = a_post++;

        System.out.println(b);
        System.out.println(a_post);


    }
}

