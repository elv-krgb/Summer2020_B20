package day16_String;

public class String_Methods {
    public static void main(String[] args) {

        // replace:
        String email = "cybertek@gmail.com";

        email = email.replace("gmail", "yahoo"); // "cybertek@yahoo.com"

        System.out.println(email);



        String word = "java";
        word = word.replace("a", "e"); //"jeve"

        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ","Python ");
        System.out.println(sentence);

        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; // replace for MIT
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java";
        s2 = s2.replace('R', 'r'); // "I like to learn Java"
        //s2 = s2.replace("R", "r"); // "I like to learn Java"
        System.out.println(s2);

        // replaceFirst:

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola"); // "I like to drink cola and tea"
        System.out.println(s3);

        String s4 = "I like to watch Game of Thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead", "");// I like to watch Game of Thrones

        System.out.println(s4);

        // indexOf()
        String s5 = "I like to stay in cybertek, we are learning java";

        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // returns the first char 'r' index
        int r3 = s5.indexOf("rn"); // returns the first char 'r' index
        System.out.println(r1);
        //System.out.println(s5.charAt(r1));// to verify
        System.out.println(r2);
        //System.out.println(s5.charAt(r2));
        System.out.println(r3);


        //lastIndexOf()
        String s6 = "Java is a programming language. and Java is fun";
        int i1 = s6.indexOf(" J")+1; // index number 36
        int i2 = s6.lastIndexOf("J"); // index number 36
        System.out.println(i1);
        System.out.println(i2);

        String s7 ="Java";
        int a1 = s7.indexOf("A"); // -1 doesn't exist, min value for index numbers is 0
        System.out.println(a1);

        /*String s8 = "Java";

        double a = s8.indexOf("a");
        char ch = s8.charAt((int)a);
        System.out.println(a);

         */



    }

}
