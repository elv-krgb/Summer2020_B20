package day33_LocalDateTime;

import java.util.Arrays;

public class SortArrayDescendingOrder {
    /*
    Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order

     */

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        //           0 1 2 3 4
        Arrays.sort(arr); // {1,2,3,4,5}

        int[] descArr = new int[arr.length]; // {5,4,3,2,1}
        int indexArr = arr.length-1;

        for(int eachElement : arr){
            descArr[indexArr] = eachElement;
//        descArr[0] = arr.length-1;
//        descArr[1] = arr[3];
//        descArr[2] = arr[2];
//        descArr[3] = arr[1];
//        descArr[arr.length-1] = arr[0];
//
            indexArr--;
        }
        System.out.println(Arrays.toString(descArr));
        System.out.println("======================================");

        int[] scores = {100, 75,85,95,65, 55};
        scores =sortDesc(scores);
        System.out.println(Arrays.toString(scores));


    }


    public static int[] sortDesc(int[] arr) {
        Arrays.sort(arr);
        int[] descArr = new int[arr.length]; // {5,4,3,2,1}
        int indexArr = arr.length - 1;

        for (int eachElement : arr) {
            descArr[indexArr] = eachElement;
            indexArr--;
        }
        return descArr;
    }




}
