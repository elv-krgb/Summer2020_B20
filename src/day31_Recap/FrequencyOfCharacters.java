package day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBCCC"; // ==> A2B3C3

        String expectedResult = ""; // A2B3C3

        String nonDup = Util.removeDup(str); // ABC

        // for each loop solution


        for(char eachCharacter : nonDup.toCharArray()){
            int count = Util.frequency(str, eachCharacter);
            expectedResult += ""+eachCharacter + count;
        }
        System.out.println(expectedResult);


/*
        // solution with for loop
        for (int i = 0; i <= nonDup.length() - 1; i++) {
            char ch = nonDup.charAt(i); // get every single characters during each repeating // A B C
            int count = Util.frequency(str, ch);                                            //  2 3 3
            expectedResult += "" + ch + count;
        }
        System.out.println(expectedResult);

 */

 /*
        char ch1 = nonDup.charAt(0); // A
        int count1 = Util.frequency(str,ch1); // 2
        expectedResult += ""+ch1+count1;

        char ch2 = nonDup.charAt(1); // B
        int count2 = Util.frequency(str,ch2); // 3
        expectedResult += ""+ch2+count2;

        char ch3 = nonDup.charAt(2); // C
        int count3 = Util.frequency(str,ch3); // 3
        expectedResult += ""+ch3+count3;

 */
        System.out.println("=====================================================");

        String str2 = "wwwwweeeeerrrrrttttyyuuu";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);

    }


    public static String frequencyOfChars(String str){

        String expectedResult = ""; // A2B3C3
        String nonDup = Util.removeDup(str); // ABC

        for(char eachCharacter : nonDup.toCharArray()){
            int count = Util.frequency(str, eachCharacter);
            expectedResult += ""+eachCharacter + count;
        }
        return expectedResult;

    }






}
