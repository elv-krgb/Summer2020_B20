package day15_String;
import java.lang.String;
import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {

       String str = "Cybertek";
      // Scanner input = new Scanner(System.in);

        String name = "Cybertek";// String literal
        String nam2 = new String("Cybertek");

        String s1 = "Cat"; // String literal // String pool // one object saved in string pool
        String s2 = "Cat";// String literal // String pool
        // 2 variables 1 object
        System.out.println(s1==s2);//true
        // "Cat" == "Cat" ==> true

        String d1 = "Dog"; // String literal // two objects in string pool
        String d2 = "dog";// String literal
        // 2 variables 2 objects
        System.out.println(d1==d2); // false
        // "Dog == "dog" ==> false

        String t1 = new String("Tiger");// new object
        String t2 = new String("Tiger");// new object
        System.out.println(t1==t2); //false, because 2 different objects
        //          new String("Tiger) == new String("Tiger) ==> false

        System.out.println("==============================================");

        String c1 = "Cybertek"; // Saved in String pool
        String c2 = new String("Cybertek"); // java heap
        String c3 = new String("Cybertek"); // java heap
        String c4 = "Cybertek"; // Saved in String pool
        String c5 = "cybertek";// Saved in String pool

        System.out.println(c1 == c2); // false
        // "Cybertek == new String("Cybertek")

        System.out.println(c2 == c3); // false
        // new String("Cybertek") == new String("Cybertek")

        System.out.println(c1==c4);// true
        // "Cybertek" == "Cybertek"

        System.out.println(c4==c5);// false
        // "Cybertek" == "cybertek"

        System.out.println("===============================");
        String str1 = "Java";
        str1 = "JavaScript";

        System.out.println(str1);//JavaScript

        str1 = "Java";
        System.out.println(str1);//Java




    }

}
