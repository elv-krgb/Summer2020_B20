package day21_Loops;
/*
write a program that can divide two numbers without using / & % operators and returns the division and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 15;
        int b = 5;

        if(b==0){
            System.out.println("invalid Input");
            System.exit(0);
        }

        int count = 0;

        while(a>=b){
            a-=b;
            count++;
        }


        System.out.println(count+" with a remainder of "+a);

    }

}
