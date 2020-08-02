package day13_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();


        System.out.println("Enter your city: ");
        String city = scan.nextLine();

        System.out.println("Enter your state: ");
        String state = scan.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();


        String address = "Your address is: "+"\n"+buildingNumber + " "+ streetName+"\n"+city+", "+state+" "+zipCode;
        System.out.println(address);




    }

}
