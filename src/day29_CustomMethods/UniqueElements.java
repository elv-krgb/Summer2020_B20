package day29_CustomMethods;

import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {"A","B","B","C","D", "E"};
        String[] arr2 = {"D", "D", "E"};
        uniques(arr);
        uniques(arr2);




    }

    public static void uniques(String[] arr){
        for(String a:arr){ // to get each element
            int count = 0;

            for(String each: arr){ // to get frequency of the elements
                if(a.equals(each)){
                    count++;
                }
            }

            if(count==1){ // if count is 1, means unique
                System.out.print(a+" ");
            }
        }
        System.out.println();


    }




}
