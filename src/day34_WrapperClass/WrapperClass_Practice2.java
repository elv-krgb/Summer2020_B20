package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("============================================");

        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // -2147483648
        int min = Integer.MAX_VALUE; // 2147483647
        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt(); // 10, 15, 5, 12. 0
            if (num > max) {
                max = num;
            }
            if(num<min){
                min = num;
            }

        }
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);


    }


}
