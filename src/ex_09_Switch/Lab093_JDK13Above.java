package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
       // in JDK > 13
        int itemcode = 002;
        switch (itemcode){
            case 001 -> System.out.println("1");
            case 002 -> System.out.println("2");
            case 003 -> System.out.println("3");
            default -> System.out.println("Default");
        }

    }
}
