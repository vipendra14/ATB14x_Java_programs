package ex_12_Logical_Programs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Generate_UniqueEmail_Userid {

    public static String generateUniqueEmail(){
        String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
        int random = new Random().nextInt(1000);

        return "testuser_" + timeStamp + "_" + random;
    }

    public static String generateUniqueuser(){
        String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
        int random = new Random().nextInt(1000);

        return "user_" + timeStamp + "_" + random;
    }
    public static void main(String [] args){
        System.out.println(generateUniqueEmail());
        System.out.println(generateUniqueuser());

    }
}
