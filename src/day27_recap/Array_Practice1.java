package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {

        //Array size is fixed.
        // Each element has an index number

        String[] names = {"Aalia", "Nurbiye", "Ayse"};
        // index numbers     0         1         2

        System.out.println(names[1]);
        //  first we need to give array name then index number

        System.out.println("==================================");

        // length-1 ==> last index

        // solution #1
        for(int i=0; i<=names.length-1; i++){  // to get each index number of array
            if(!names[i].startsWith("A")) {
                System.out.println(names[i]); // then print array names [index number i]
            }
        }

        //solution #2
        for(int i=0; i<=names.length-1; i++) {
            if (names[i].charAt(0) != 'A') { // if names index number 0 not = 'A'
                continue;// then skip it
            }
            System.out.println(names[i]);
        }

        System.out.println("===============================");

        int[] numbers = new int[5]; // if you initialize SIZE ONLY it will print default value
        // int, long, byte, short ==>0
        // float, double ==> 0.0
        // boolean ==> false
        // string ==> null

        numbers[3] = 25;
        numbers[0] = 100;
        numbers[3] = 300; // it will reassigned

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));// to get numbers on console
        System.out.println("==============================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");
        String[] students = new String[scan.nextInt()];
        //                             size of array
        // if user says 5, the size of students array 5


        scan.nextLine(); // to take out Enter in scanner

        for(int i=0; i<=students.length-1; i++ ){  // to ask user  to Enter name and
                                                  // get each index of students array
            System.out.println("Enter a name");
            students[i]=scan.nextLine(); // we assign user input to student index number [i]
            // first loop [i] = index number 0
            // second loop [i] = index number 1
            // third loop [i} =  index number 2
            // fourth loop [i} = index number 3

        }

        System.out.println(Arrays.toString(students));






    }

}
