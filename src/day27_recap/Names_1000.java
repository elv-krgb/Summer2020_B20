package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Names_1000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");
        String[] students = new String[scan.nextInt()];
        String str = "Name";

        for (int i = students.length - 1; i >= 0; i--) {
            students[i] = str + i;

        }
        System.out.println(students.length);
        System.out.println(Arrays.toString(students));
    }
}


