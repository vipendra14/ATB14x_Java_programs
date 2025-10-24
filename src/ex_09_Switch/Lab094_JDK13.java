package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemcode = 010;
        switch (itemcode){
            case 001, 002, 003, 007 :
                System.out.println("All of them are electronic gadget");
                break;
            case 004, 005, 006:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("None");

        }
    }
}
