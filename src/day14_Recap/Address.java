package day14_Recap;
/*
2. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.next();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        scan.close();

        System.out.println("\nShip To: "+fullName+"\n"+buildingNumber+" "+streetAddress
                +"\n"+cityName+", "+stateName+" "+zipCode);


    }

}
