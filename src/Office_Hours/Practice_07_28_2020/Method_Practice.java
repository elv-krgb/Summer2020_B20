package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Method_Practice {
    public static void main(String[] args) {
        String name = "CBA";
        String reversedName =reverseStr(name);
        System.out.println(reversedName.toLowerCase());
        //System.out.println(reverseStr(name));

       palindrome("level");
       palindrome(name);

       System.out.println("=================================================");

       String[] names = {"Aslan", "Ramazan", "Alex", "Erfan", "Aalia", "Ayhan", "Bob"};
        ArrayList<String> nameList = new ArrayList<>();
       for(String eachEl : names){
           //System.out.println(reverseStr(eachEl));
           //palindrome(eachEl);

           nameList.add(reverseStr(eachEl));

       }
        System.out.println(nameList);




    }

    public static String reverseStr(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            result+=ch;
        }
        return result;
    }

    public static void palindrome(String str) {
        String reversedStr = reverseStr(str);
       boolean palindrome = str.equalsIgnoreCase(reversedStr);
        System.out.println(palindrome? str+" Is Palindrome" : str+" Is not palindrome");

    }

}
