package day35_ArrayList;

import java.util.ArrayList;

public class ReversedOrder {
    /*
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

     */
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>(); // default size 10
        list.add(1); // index number 0
        list.add(2); // index number 1
        list.add(3); // index number 2
        list.add(4); // index number 3
        list.add(5); // index number 4 ==> changed index number 5
        list.add(4,10); // index number now 4

        System.out.println(list);



        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



    }

}
