package ex_04_Operators;

public class Lab048_Gates_Interview {
    public static void main(String[] args) {
        int Vip_sal = 25;
        boolean b =(!(Vip_sal > 20) || (Vip_sal < 10)); // False
        System.out.println(b);
    }
}

/*(Vip_sal > 20) =  True
* (Vip_sal < 10) = False
* (True || False) = Ture
* !(True) = False  */