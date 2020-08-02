package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {
        // charAt(index) ==> char
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(1);
        System.out.println(ch1); // y

        // +
        String str2 = "Cubertek";
        str2 = str2 + " "+"School";
        System.out.println(str2);

        // length() starts with 1 ==> int
        String str3 = "Cybertek";
        //             01234567 - index numbers
        int l = str3.length(); // 8
        System.out.println(l);

        // lastindex: length-1

        char ch2 = str3.charAt(l-1); // str3.length()-1 ==? 15-1 ==>14
        System.out.println(ch2);
        System.out.println("last index: "+(l-1));

        //upperCase & lowerCase

       // String str4 = "cybertek".toUpperCase();
        String str4 = "cybertek".toUpperCase();
        str4 = str4.toUpperCase(); //"CYBERTEK"
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase(); //java
        System.out.println(str5);

        //trim()
        String str6 = "          Cybertek        School "; // only spaces are not separating word, will be printed
        System.out.println(str6);
        str6 = str6.trim();
        System.out.println(str6);

        // substring(): ENDING INDEX IS EXCLUDED. BEGINNING INDEX IS INCLUDED
        String str7 = "I like Java language";
        //             0123456789...
        String word = str7.substring(7,11);//10+1 // Java
        System.out.println(word);

        String word2 = str7.substring(12);// recommended way
        String word3 = str7.substring(12, str7.length());
        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(2,6); //5+1
        System.out.println(word4);

        //indexOf && lastIndexOf
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1); // 23
        System.out.println(str8.charAt(23)); // W

        int i2 = str8.indexOf("We");
        System.out.println(i2);
        System.out.println(str8.charAt(38));

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");// last Java "J"
        System.out.println(i4);

        int i5 = str9.indexOf("J");// first Java "J"
        System.out.println(i5);

        int i6 = str9.indexOf(" Java ")+1;
        System.out.println(i6); // second Java "J";

        int i7 = str9.lastIndexOf("Java "); // second Java "J"
        System.out.println(i7);

        //replace && replaceFirst
        String s1 = "I like Java, Java is programming language";
        s1 = s1.replace("Java", "C#");// replaced al "Java"
        System.out.println(s1);

        String s2 = "I like Java, Java is programming language";
        s2 = s2.replaceFirst("Java", "C#"); // replaced first "Java"
        System.out.println(s2);

        String s3 = "I like Java, Java is programming language";
        s3 = s3.replace("Java is", "C# is"); // replaced second "Java", you need to make it unique
        System.out.println(s3);












    }

}
