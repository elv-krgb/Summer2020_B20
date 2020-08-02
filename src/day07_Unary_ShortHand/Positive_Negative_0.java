package day07_Unary_ShortHand;

public class Positive_Negative_0 {
    /*
    1. write a program that can verify if a number is positive, negative, 0
        Positive_Negative_0
        Ex:
            number = 120
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 ii zero? false
     */

    public static void main(String[] args) {

        double number = 120; // for numbers better use double

        boolean positiveN = number > 0;
        boolean negativeN = number < 0;
        boolean zeroN = number == 0;

        System.out.println(number + " is positive number? "+positiveN);
        System.out.println(number + " is negative number? "+ negativeN);
        System.out.println(number + " is zero? " + zeroN);


    }


}
