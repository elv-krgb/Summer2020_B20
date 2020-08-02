package day32_methodOverLoading;
/*
 1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

 */

import java.util.Scanner;

public class formatFullName {
    // fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String first =scan.nextLine();
        String last = scan.nextLine();

        String fullName = formatFullName(first, last);
        System.out.println(fullName);
/*
        first= first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase(); // C + ybertek
        //convert first character to upper case      // convert rest of characters to lower case

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); // S + chool

        //String formalFormatFullName = first.concat(" "+last);
         String formalFormatFullName = first+" "+last;

        System.out.println();

 */

    }

    public static String formatFullName(String first, String last ){

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase(); // C + ybertek
        //convert first character to upper case      // convert rest of characters to lower case

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); // S + chool

        //String formalFormatFullName = first.concat(" "+last);
        String fullName = first+" "+last;

        return fullName;
    }



}
