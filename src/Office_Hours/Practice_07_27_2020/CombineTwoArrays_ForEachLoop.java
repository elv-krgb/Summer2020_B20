package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays_ForEachLoop {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C', 'D'}; // length 4
        // index num  0    1    2    3
        char[] a2 = {'E', 'F', 'G'}; // length 3
        // index num  0    1    2

        char[] a3 = new char[a1.length+a2.length]; // [ ,  ,  ,  ,  ,  ,  ]
/*
        a3[0] = a1[0]; // a3 index 0 = a1 index 0 ==> A
        a3[1] = a1[1]; // a3 index 1 = a1 index 1 ==> B
        a3[2] = a1[2]; // a3 index 2 = a1 index 2 ==> C
        a3[3] = a1[3]; // a3 index 3 = a1 index 3 ==> D
        a3[4] = a1[0]; // a3 index 4 = a2 index 0 ==> E
        a3[5] = a1[1]; // a3 index 5 = a1 index 1 ==> F
        a3[6] = a1[2]; // a3 index 6 = a1 index 2 ==> G

 */

        int index = 0;
        for(char each : a1){
            a3[index] = each;
            index++;
        }

        for(char each : a2){
            a3[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(a3));


    }

}
