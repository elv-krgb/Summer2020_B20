package day31_Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        max(10,20);
        System.out.println(max2(10,20));
        System.out.println(max2(10,20)*2);


    }

    public static void max(int num1, int num2){
        int max = (num1 > num2)? num1 : num2;
        System.out.println("Maximum: "+max);

        }


    public static int max2(int num1, int num2){
        int max2 = num1 > num2? num1 : num2;
        return max2;


    }








}







