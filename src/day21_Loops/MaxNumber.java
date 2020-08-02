package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648; //

        for(int i = 10; i<=50; i+=10){

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 10, 20, 30, 40, 10

            if(num>max){ // greater number user input wil be assign yo max
                max = num;
            }

        }

        System.out.println("Max number: "+max);


    }

}
