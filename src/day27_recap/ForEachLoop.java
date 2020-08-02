package day27_recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //           0 1 2 3 4

       // *solution with for loop
        for(int i = 0; i<=arr.length-1; i++){// to get each index numbers
            // i=index number // 0, 1, 2, 3, 4
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // *solution with for each loop
        for(int i : arr){// to get each element
            // i=element // 1, 2, 3, 4, 5
            System.out.print(i+" ");
        }
        System.out.println();

        // reverse
        for(int i = arr.length-1; i>=0; i--){// to get each index numbers
            // i=index number // 4, 3, 2, 1, 0
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("======================================");

        //divisible by 3
        int countDivisibleBy3 = 0;
        int[] scores = {10,20,30,40,50,60,70,80,90,100,110};
        for(int each: scores){// to get each element
            if(each % 3 !=0){
                continue;
            }
            countDivisibleBy3++;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(countDivisibleBy3);

        System.out.println("=======================================");
        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for (String each : names) {
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("=========================================");

        int[] score = {80,75,65,110,90,45,56,78};
        int max =score[0];
        int min = score[0];

        for(int everySingleElement : score){
            if(everySingleElement > max){
                max = everySingleElement;
            }
             if(everySingleElement<min){
                 min = everySingleElement;
             }

        }
        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);
        System.out.println("=========================================");

        //finding max and min with sorting method (Array utility)
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Maximum number: "+ score[score.length-1]);
        System.out.println("Minimum number: "+ score[0]);















    }

}
