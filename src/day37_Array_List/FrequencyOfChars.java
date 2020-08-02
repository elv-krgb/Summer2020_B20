package day37Array_List;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    /*
    2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

     */

    public static void main(String[] args) {
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")) {
            list.add(each);
        }

        String nonDup = Util.removeDup(str); // "ABC"
        for(String each : nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print(each+count); //A3B2C1

        }



    }

}
