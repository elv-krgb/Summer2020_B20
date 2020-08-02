package day31_Recap;
/*
1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
 */

public class WarmUpTasks {
    public static void main(String[] args) {

        String str = "aabcccd";
        String uniques = ""; //"bd

//        solution with for loop
//            for(int indexNum = 0; indexNum<=str.length()-1; indexNum++){
//            char ch = str.charAt(indexNum);
//            int count = frequency(str, ch);
//            //System.out.println(count);
//            if(count == 1){
//                uniques+=ch;
//            }
//          }
//        System.out.println(uniques);

        // solution wit for each loop
        for(char eachElement : str.toCharArray()){
            int count = frequency(str, eachElement);
            if(count == 1) {
                uniques += eachElement;
            }
        }
        System.out.println(uniques);

        System.out.println("==============================================");

        String str2 = "ppppoooiiiuuytttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);




    }

    public static int frequency(String str, char ch) { // it takes String and char and will return as an int
                                                       // int count = frequency of characters
                                                       // finds the frequency of char from String str
        int count = 0; // to store frequency
        for (char eachElement : str.toCharArray()) {
            if (eachElement == ch) {
                count++;
            }
        }
        return count;
    }


    public static String uniques(String str){
        String uniques = ""; // to store unique characters
        for(char eachElement : str.toCharArray()){
            int count = frequency(str, eachElement); // frequency of every character
            if(count == 1) {
                uniques += eachElement;
            }
        }
        return uniques;
    }



}
