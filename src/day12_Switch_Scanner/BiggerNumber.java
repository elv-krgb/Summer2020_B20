package day12_Switch_Scanner;

public class BiggerNumber {
    /*
    Warmup tasks:
    1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT

     */

    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 200;
        double n3 = 300;

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n2 > n1 && n2 > n3;
        //      n2IsBigger == false && n2>n3

       /* String result = "";

        if(n1IsBigger){
            result = "n1 is bigger";
        }else if(n2IsBigger){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);

        */


        String result = (n1IsBigger)? "n1 is bigger" :(n2IsBigger)? "n2 is bigger" : "n3 is bigger";
        System.out.println(result);







    }

}
