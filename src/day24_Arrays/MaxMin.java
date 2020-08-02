package day24_Arrays;

import java.util.Scanner;

/*
2. write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers

 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter");
        int n = scan.nextInt();

        int[] arr = new int[n]; // we will assign numbers

        for (int i=0; i<=n-1; i++){// get user input and storing them in array
            //        i<n
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
            // index number of num
            // i: 0, 1, 2, 3, 4,
        }

        int max = arr[0]; // first index of arr
        int min = arr[0]; //

        for(int i=0; i<=arr.length-1; i++){

            if(arr[i] > max){
                max = arr[i]; // whichever num is greater we will assign
            }

            if(arr[i] < min){
                min = arr[i]; // whichever num is smaller we will assign
            }

        }
        System.out.println("Maximum number: "+ max);
        System.out.println("Minimum number: "+min);


    }

}
