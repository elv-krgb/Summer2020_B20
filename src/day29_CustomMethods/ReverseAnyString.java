package day29_CustomMethods;

public class ReverseAnyString {
    public static void main(String[] args) {
        reverseString("Elvira");
        reverseString("Cybertek");







    }

    public static void reverseString(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);   // result+=str.substring(i, i+1)
        }
        System.out.println(result);

    }






}
