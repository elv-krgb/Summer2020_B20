package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc {
    public static void main(String[] args) {
        int[] arr = {98,97,100,200,55,68,79};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];
        System.out.println(Arrays.toString(descArr));
 /*
//      indexDescArr    indexArr
        descArr[0] = arr[6];
        descArr[1] = arr[5];
        descArr[2] = arr[4];
        descArr[3] = arr[3];
        descArr[4] = arr[2];
        descArr[5] = arr[1];
        descArr[descArr.length-1] = arr[0];  // descArr[6] = arr[0];
        System.out.println(Arrays.toString(descArr));

  */

        int indexDescArr = 0;
        for(int indexArr=arr.length-1; indexArr>=0; indexArr--){
            descArr[indexDescArr] = arr[indexArr];    // descArr[0] = arr[6];
            indexDescArr++;

        }
        System.out.println(Arrays.toString(descArr));









    }






}
