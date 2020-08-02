package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {
        int[] arr = {100,200,3,50};
        int num = maxNum(arr);
        System.out.println(num);
        System.out.println(num>300);


    }

    public static int maxNum(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    public static void maxNum2(int[] arr){
        Arrays.sort(arr);
        int max2 = arr[arr.length-1];

    }




}
