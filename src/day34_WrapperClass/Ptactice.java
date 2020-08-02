package day34_WrapperClass;

import java.util.Arrays;

public class Ptactice {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4};

        Integer[] arr2 = {1, 2, 3, 4};
        for (Integer eachEl : arr2) {
            System.out.println(eachEl);
        }

        double[] arr3 = {1, 2, 3, 4};
        Double[] arr4 = {1.0, 2.0, 3.0, 4.0};
        for(Double eachEl : arr4){
            System.out.println(eachEl);
        }

        char[] arr5 = {65,67,68,69};
            System.out.println(Arrays.toString(arr5));

            char ch = 79;
        System.out.println(ch);
            Character ch2 = 79;

        System.out.println(ch2);

        String[] nums1 = {"12", "13.0", "14.0", "15.0"};
        double [] nums2 = new double[nums1.length];

        for(int i=0; i<=nums1.length-1; i++){
            nums2[i] = Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));






    }
}
