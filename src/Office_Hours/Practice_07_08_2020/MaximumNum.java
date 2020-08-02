package Office_Hours.Practice_07_08_2020;
/*
 1. write a program that asks user to enter 5 numbers and returns the maximum number
maximum int value:  2147483647
minimum int value:  -2147483648

 */

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n>max){
                max = n;
            }

        }
        System.out.println("max: "+max);


    }
}
