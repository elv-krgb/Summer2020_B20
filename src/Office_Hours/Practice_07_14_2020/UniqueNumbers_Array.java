package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers_Array {
    public static void main(String[] args) {
        int[] arr1 ={1,1,2,3,3,5};

        for(int b: arr1) { // getting each character from arr1
            // first check frequency of arr1
            // we need to give index number
            //int num = arr1[b]; //  to store index numbers

            int count = 0; // frequency of num in arr1
            //                frequency if num "1" - 2
            //                frequency if num "2" - 1
            //                frequency if num "3" - 2

            for (int each : arr1) {// for counting frequency of num
                //   each represents elements in arr1
                if (each == b) {
                    //each
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(b);
            }
        }




    }

}
