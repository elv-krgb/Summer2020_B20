package day13_Scanner;

import java.util.Scanner;

public class Scanner_nextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Full name: "+fullName);
        System.out.println("company name: "+companyName);


    }


}
