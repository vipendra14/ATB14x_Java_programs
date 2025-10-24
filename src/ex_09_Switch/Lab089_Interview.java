package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char c = 'A';
        switch (c) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Does not match");
        }
    }
}
