package day31_Recap;

public class Method_Practice2_ReverseString {
    public static void main(String[] args) {
        String name = "madam";

        reverse1(name); // return type - void // executes only functionality
        //System.out.println(reverse1(name));
        //System.out.println(name.equalsIgnoreCase(reverse1(name);));

        String rev = reverse2(name);
//        System.out.println(reverse1(name););
//        System.out.println(name.equalsIgnoreCase(reverse2(name)));




    }



    public static void reverse1 (String str) {
        String reversedString1 = ""; // to store reversed order of str
        for (int indexStr = str.length() - 1; indexStr >= 0; indexStr--) {
            reversedString1 += str.charAt(indexStr);
        }
        System.out.println(reversedString1);
    }

    public static String reverse2 (String str){
            String reversedString2 = ""; // to store reversed order of str
            for (int indexStr = str.length() - 1; indexStr >= 0; indexStr--) {
                reversedString2 += str.charAt(indexStr);
            }
            return reversedString2;
        }




}




