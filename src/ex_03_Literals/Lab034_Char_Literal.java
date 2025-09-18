package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 ='A';   //A - Z, a - z, !@#$%&*()_+
      //  char c = "A";  // "" == String = Bunch of Char

        char c2 ='B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '1';
        char c6 = '9';
        char c7 = '(';
        char c8 = ' '; // blank space

        //Escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Hello Vipendra");
        System.out.println("Vipendra" +new_line+ "Mishra");
        System.out.println("Vipendra\nMishra");
        System.out.println("Vipendra" +tab_line+ "Mishra");
        System.out.println("Vipendra" +back_space+ "Mishra");
        System.out.println("Hello, This_is_the_First_Line"+ new_line+ "This is the second line\n this is the third line");





    }
}
