package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C','C'));

        System.out.println(list);

        ArrayList<Character> nonDupl = new ArrayList<>(); // expected result {A,B,C};

        for(Character each : list){ // to get each character
            if(!nonDupl.contains(each)){ // if nonDupl doesn't contain each character, then add.
                nonDupl.add(each);
                // loop 1 ==> 'A' ==> nonDupl doesn't contain A ==> false, so it will add A
                // loop 2 ==> 'A' ==  nonDupl  contain A ==> true, so it will not add A
                // loop 3 ==> 'B' ==> nonDupl doesn't contain B ==> false, so it will add B
                // loop 4 ==> 'B' ==  nonDupl  contain B ==> true, so it will not add B
                // loop 5 ==> 'C' ==> nonDupl doesn't contain C ==> false, so it will add C
                // loop 5 ==> 'C' ==  nonDupl  contain C ==> true, so it will not add C
            }
        }
        System.out.println(nonDupl);



    }

}
