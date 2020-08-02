package day19_ForLoop;
/*
Write a program that asks user to enter his/her username and password until user enters correctly.
 */

import java.util.Scanner;

public class WhileLoop_Practice3_Username_Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input =scan.nextLine();

        while( !input.equals(password)){
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("Logged in");

    }

}
