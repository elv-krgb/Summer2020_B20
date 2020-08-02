package day24_Arrays;
/*
3. Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */
public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // index     0 1 2 3 4 5 6 7 8 9

        int sum = 0;

        //for(int i=0; i<=arr.length-1; i++){
        for(int i = arr.length-1; i>=0; i--){
            sum += arr[i]; // i - index number of arr
        }

        System.out.println("sum: "+sum);

        double average = (double)sum/arr.length;

        System.out.println(average);

        double d1 = 10/3; // 3 ==> 3.0
        System.out.println(d1);

        double d2 = 10/3.0;
        System.out.println(d2); // 3.33




    }

}
