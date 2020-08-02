package day26_MultiDimensionalArray;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {2,1,3};
        Arrays.sort(arr); // arr = {1,2,3}
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length]; // {3,2,1}
        /*
        desc[0] = arr[arr.length-1];
        desc[1] = arr[1];
        desc[2] = arr[0];

         */


        //   #1
        int k = arr.length-1;
        for(int i = 0; i <= desc.length-1; i++){ // i: 0,1,2
            desc[i] = arr[k];
            k--; // k=2; k=1; k=0;

        }
        System.out.println(Arrays.toString(desc));

        //  #2
        int j = 0;
        for(int i=arr.length-1; i>=0; i--){
            desc[i] = arr[j++];
            //j++;
        }
        System.out.println(Arrays.toString(desc));

        //  #3
        for(int num: arr){
            desc[num-1] = arr[arr.length-num];
        }
        System.out.println(Arrays.toString(desc));









    }

}
