package day32_methodOverLoading;

import java.util.Arrays;

public class methodOverloading {
    public static void main(String[] args) {
        int[] arr ={9,7,8};
        Arrays.sort(arr);

        String[] names = {"D", "C", "B"};
        Arrays.sort(names);
    }
    public static void method(int a) {

    }

    public static void method(double c){

    }



}
