package day34_WrapperClass;
import java.util.ArrayList;
import java.util.Arrays;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println(scores);
        System.out.println(scores.size());
        scores.add(95);  // index 0   // index 0             // autoBoxing
        scores.add(100); // index 1   // index 2
        scores.add(85);  // index 2   // index 3
        scores.add(75);  // index 3   // index 4
        scores.add(1,65);  // index 1 = 65
        // scores.add(7,55); // indexOutOfBound, because we skipped index 5 , 6

        System.out.println(scores);
        // add() overloaded method

        System.out.println(scores.get(2)); // 100
        Integer n = scores.get(1);
        System.out.println(n); // 65








    }

}
