package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();


        switch(browser){
            case "Chrome":
                System.out.println("starting the chrome browser");
                System.out.println("-----");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Firefox":
                System.out.println("starting the firefox browser");
                System.out.println("-----");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Edge":
                System.out.println("starting the Edge browser");
                System.out.println("-----");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("starting the default browser");
                break;
        }
    }
}
