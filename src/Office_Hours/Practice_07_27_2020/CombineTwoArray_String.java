package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArray_String {
    public static void main(String[] args) {
        String[] a1 = {"Tetiana", "Hamit", "Phornsri"}; // i: 0, 1, 2
        String[] a2 = {"Aalia", "Zaki", "Christina", "Dawut"}; // i: 0, 1, 2, 3

        String[] a3 = new String[a1.length+a2.length]; // [null, null, null, null, null, null, null]
        // we need to assign elements                       0     1     2     3     4     5     6
        //System.out.println(Arrays.toString(a3));

        for(int i = 0; i<=a1.length-1; i++){
           a3[i] = a1[i];
        }

        for(int i = 0; i<=a2.length-1; i++){
            a3[i+a1.length] = a2[i];
        }
        System.out.println(Arrays.toString(a3));



    }

}
