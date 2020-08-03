package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        // remove names that are not start and end with the same character
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,4,5,6,7,8));
        list.removeIf(p -> Collections.frequency(list, p) ==1 );
        System.out.println(list);

        System.out.println("============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Aalia", "Arpat", "Aslan", "Alla", "Ernis"));
        names.removeIf( p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1) );
        System.out.println(names);

        System.out.println("============================================");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll( Arrays.asList(100,90,75,85, 80, 89,65,73,55, 59));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        /*
        how many students made:
        A?
        B?
        C?
        D?
        how many failed

        DO not use loop
         */

        gradeOfA.addAll(grades);
        gradeOfA.removeIf( p -> p < 90);

        gradeOfB.addAll(grades);
        gradeOfB.removeIf( p -> p > 89 || p < 80);

        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p -> p > 79 || p < 70);

        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p -> p > 69|| p < 60);

        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p -> p > 59 );

        System.out.println("A: " + gradeOfA.size());
        System.out.println("B: " + gradeOfB.size());
        System.out.println("C: " + gradeOfC.size());
        System.out.println("D: " + gradeOfD.size());
        System.out.println("F: " + gradeOfF.size());

















    }

}
