package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,3,4,5,6,7,8,8,9));
        list.removeIf( p -> Collections.frequency(list, p ) !=1);
        //                  for the element that are not unique
        System.out.println(list);

        System.out.println("======================================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a', 'b', 'c', '3', '4', '5','&','*','%') );

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        chars.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println(chars);


        System.out.println("=======================================================");

        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('a','1','b', '2','c','d','$','#','#','@','?'));
        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list1);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits: "+digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list1);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters: "+letters);

        ArrayList<Character> specialChar = new ArrayList<>();
        specialChar.addAll(list1);
        specialChar.removeAll(digits);
        specialChar.removeAll(letters);
       // specialChar.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println("Special Characters: "+ specialChar);








    }

}
