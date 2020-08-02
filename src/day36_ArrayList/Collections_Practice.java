package day36_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
        // sort
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30, 20, 40, 50, 15));

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> descendingList = new ArrayList<>();

        for(int i=list.size()-1; i>=0; i--){
            //System.out.print(list.get(i)+ " ");
            descendingList.add(list.get(i));
        }
        System.out.println(descendingList);


        // swap
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        // index number             0    1    2    3    4
        System.out.println(list2);

        Collections.swap(list2, 1, 2); // swap B with C ==> {A, C, B, D, E}
        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);// swap A with E ==> [E, C, B, D, A]
        System.out.println(list2);


        // frequency
        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList('A','B','A','A','A','C'));
        int count = Collections.frequency(charList, 'A'); //4
        System.out.println(count);


    }

}
