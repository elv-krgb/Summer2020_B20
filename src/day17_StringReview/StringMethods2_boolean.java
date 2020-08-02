package day17_StringReview;

public class StringMethods2_boolean {
    public static void main(String[] args) {

        //equals
        String s1 = "Cat"; // String pool
        String s2 = new String("Cat"); // heap
        String s3 = new String("Cat"); // heap

        System.out.println(s1==s2); // FALSE
        System.out.println(s1.equals(s2)); // TRUE

        System.out.println(s2==s3); // FALSE
        System.out.println(s2.equals(s3));// TRUE

        //equalsIgnoreCase: ignores case sensitivity
        String s4 = "java";
        String s5= "Java";

        System.out.println(s4.equals(s5)); // FALSE
        System.out.println(s4==s5);// FALSE, different objects
        System.out.println(s4.equalsIgnoreCase(s5)); // TRUE

        String s6 = "MuHtAr";
        String s7 = "muhtar";

        System.out.println(s6.equalsIgnoreCase(s7)); //TRUE

        //isEmpty: checks of the length of string is 0
        String str = " ";
        System.out.println(str.isEmpty()); // FALSE

        str = str.trim(); // "" empty
        System.out.println(str.isEmpty());// TRUE

        String str2 = "Cybertek"; // length != 0
        System.out.println(str2.isEmpty());// FALSE

        str2 = ""; // length == 0
        System.out.println(str2.isEmpty()); // TRUE

        //contains:
        String str3 = "Java, C#, Python, Ruby, C++";
        System.out.println(str3.contains("Java")); // TRUE
        System.out.println(str.contains("java"));// FALSE
        System.out.println(str3.toLowerCase().contains("java")); //TRUE

        String str4 = "ABCD";
        System.out.println(str4.contains("D")); // TRUE

        //startsWith & endWith
        String str5 = "Cybertek";
        System.out.println(str5.startsWith("Cyb")); //TRUE
        System.out.println(str5.startsWith("CybABC")); // FALSE
        System.out.println(str5.startsWith("E") || str5.startsWith("C"));// TRUE
        //                     false            ||       true        ==>    true

        String str6 = "Today is a great day";
        System.out.println(str6.endsWith("day")); // TRUE
        System.out.println(str6.endsWith("great")); // FALSE







    }

}
