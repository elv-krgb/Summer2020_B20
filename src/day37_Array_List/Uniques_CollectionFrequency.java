package day37_Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques_CollectionFrequency {
    /*
1. write a program that can find the unique characters from a string
           DO NOT use nested loop
           "ABABCDEE"
           output: C D

*/
    public static void main(String[] args) {
        String str = "ABABCDEE";
        String uniques = "";

        //solution with .toCharArray
        ArrayList<Character> list1 = new ArrayList<>();
        for (char each : str.toCharArray()) {
            list1.add(each);
        }
        for(char each : list1) {
            int count = Collections.frequency(list1, each);
            if (count == 1) {
                System.out.println(each);
            }
        }



        // solution with split("")
        ArrayList<String> list2= new ArrayList<>();
        for (String each : str.split("")) {
            list2.add(each);

        }
        System.out.println(list2);

        for(String each : list2) {
            int count = Collections.frequency(list2, each);
            if (count == 1) {
                uniques+=each;
            }
        }
        System.out.println(uniques);

        ArrayList<String> list3= new ArrayList<>();





    }
}
