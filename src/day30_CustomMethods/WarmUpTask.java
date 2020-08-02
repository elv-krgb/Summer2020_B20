package day30_CustomMethods;
/*
 1. create a function that can print out the maximum number between two numbers
 2. create a function that can print out the array of integers in descending order
 3. create a function that can print out the combination of two integer arrays
 4.
    step1: create a function that can check if the given integer is positive, negative or zero
    step2: Use the above method to  write a program that can check every single elements of an array of Integers
    MUST use for each loop

 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        maxNumBetweenTwoNum(123,124);

        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45,};
        printDescending(arr);

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10};
        combine2Arrays(a1,a2);

        posNegZero(100);
        System.out.println("============================================");
        int[] a3 = {100, -100, -200, -300, 0, 0, 900, 5000};
        for(int each : a3){
            posNegZero(each);
        }




    }


    //task 01
    public static void maxNumBetweenTwoNum(int num1, int num2){
        if(num1 == num2){
            System.out.println("Equal");
            return; // exits the method
        }
        if(num1>num2){
            System.out.println(num1+" is maximum");
        }else{
            System.out.println(num2+" is maximum");
        }

    }

    //task02
    public static void printDescending(int[]arr){ // {10,9,20,30,5,6,7}
        Arrays.sort(arr); // {5,6,7,9,10,20,30}

        //expected result 30,20,10,9,7,6,5
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //task3
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        // size of arr3 = size of arr1 + size of arr2

        int i =0; // index
        for(int eachElementArr1 : arr1){ //
            arr3[i] = eachElementArr1;
            i++;
        }

        for(int eachElementArr2 : arr2){
            arr3[i] = eachElementArr2;
            i++;
        }

        System.out.println(Arrays.toString(arr3));
    }

    //task4
    public static void posNegZero(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }








}
