package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {


        int[][][] arr3D = {{{1, 2}, {3, 400}}, {{5, 6, 7}, {8, 9, 10}}};

        int max = arr3D[0][0][0];
        int min = arr3D[0][0][0];

        for (int[][] each2DArray : arr3D) {
            for(int[] each1DArray : each2DArray){
                for (int eachElement : each1DArray){
                    if(eachElement>max){
                        max=eachElement;
                    }
                    if(eachElement<min){
                        min=eachElement;
                    }
                }
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+ min);


    }



}
