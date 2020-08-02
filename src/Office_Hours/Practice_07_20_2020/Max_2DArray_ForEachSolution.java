package Office_Hours.Practice_07_20_2020;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_2DArray_ForEachSolution {
    public static void main(String[] args) {
        // elemets index   0  1  2    0 1 2 3    0 1 2  3  4     0  1  2  3  4  5
        int[][] arr2D = { {1, 2, 3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,20,16,17} };
        //  array index       0          1              2                3

        int max = arr2D[0][0];

        for( int[] eachArray : arr2D){  // to get each 1D Array
            for (int eachElement : eachArray){ // to get each element
                if(eachElement>max){
                    max = eachElement;
                }
            }
        }
        System.out.println("Maximum: "+max);

    }
}
