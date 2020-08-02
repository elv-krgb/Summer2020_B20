package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = scan.nextInt(); // 5

        int[] arr = new int[size];

        for(int indexArr = 0; indexArr < size; indexArr++){
            System.out.println("Enter a number");
            arr[indexArr] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // [1,2,3,4,5]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr = new  int[size];
        int indexArr = arr.length-1;
        for(int arrElement : arr){
            descArr[indexArr] = arrElement;
            indexArr--;
        }

        System.out.println(Arrays.toString(descArr));

        }




    }


