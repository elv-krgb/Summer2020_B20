package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "Level";
//        reverseStr1(name);
//        System.out.println(name.equalsIgnoreCase());
      // String reversedName = reverseStr2(name);
        System.out.println(name.equalsIgnoreCase(reverseStr2(name)));





    }

    public static void reverseStr1(String str1){
        String result = ""; // to store reverse characters
        for(int i=str1.length()-1; i>=0; i--){
            result+=str1.charAt(i);
        }
        System.out.println(result);
    }

    public static String reverseStr2(String str2) {
        String result = ""; // to store reverse characters
        for (int i = str2.length() - 1; i >= 0; i--) {
            result += str2.charAt(i);
        }
        return result;


    }



}
