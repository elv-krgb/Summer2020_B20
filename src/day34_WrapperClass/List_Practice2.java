package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(140);
        nums.add(50);
        nums.add(20);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer eachEl : nums){
            if(eachEl>max){
                max = eachEl;
            }
            if(eachEl<min){
                min = eachEl;
            }
        }
        System.out.println(max);
        System.out.println(min);



    }

}
