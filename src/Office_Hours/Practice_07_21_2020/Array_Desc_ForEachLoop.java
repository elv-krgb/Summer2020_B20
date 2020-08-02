package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc_ForEachLoop {
    public static void main(String[] args) {


        int[] arr = {98, 97, 100, 200, 55, 68};
        Arrays.sort(arr); // 55, 68, 97, 98, 100, 200
        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];
        int indexArr = arr.length-1;

        for(int arrElement : arr){  // 55, 68, 97, 98, 100, 200
            descArr[indexArr] = arrElement;
            indexArr--;
        }

        System.out.println(Arrays.toString(descArr));


    }
}
