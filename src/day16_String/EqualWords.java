package day16_String;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

       /* if(word1.equal(word2)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

        */

        String result = (word1.equalsIgnoreCase(word2))? "Equal" : "Not Equal";
        System.out.println(result);



    }

}
