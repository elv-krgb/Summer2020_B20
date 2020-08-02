package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {

        // isEmpty()
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        // equals()
        String str1 = "Java"; // String pool
        String str2 = new String("Java"); // heap
        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2); // false, different location

        System.out.println(str1.equals(str2)); // true

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3==str4);// false, 2 different objects
        System.out.println(str3.equals(str4)); // true

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); // true, because it is the same object
        System.out.println(str5.equals(str6)); // true, because the same text

        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7.equals(str8)); // false, because of key sensitivity

        // equalIgnoreCase()
        System.out.println(str7.equalsIgnoreCase(str8)); // true. because it ignores key sensitivity

        // contains()
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); // true
        System.out.println(str.contains("java")); // true
        System.out.println(str.contains("Java")); // false

        //startWith()
        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J")); // false

        System.out.println(s1.startsWith("Mu")); // true

        System.out.println(s1.toLowerCase().contains("mu")); // true
        //                    "muhtar"      contains "mu"


        //endWith()
        String s2 = "Muhtar";
        System.out.println(s2.endsWith("r")); // true













    }

}
