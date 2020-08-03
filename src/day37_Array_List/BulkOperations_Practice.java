package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String>  students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Dawud");
        students.add("Ramazan");

        //verify that names: Ulku, Busra are contained in student list

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra"));
        System.out.println(r1);

        System.out.println("=============================================");

        ArrayList<String> group25 = new ArrayList<>();
        // add all student name in your group
        // verify your mentor and one friends names are contained in the list

        group25.addAll(Arrays.asList("Milan", "Jildiz", "Zhanyl", "Kamil", "Paban"));
        System.out.println(group25);
        boolean r2 =group25.containsAll(Arrays.asList("Roza", "Assylkhan"));
        System.out.println(r2); // false (((((((

        System.out.println("===============================================");

        // remove all the names "Ahmed"
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.addAll(Arrays.asList("Aslan", "Beslan", "Meerim", "Ahmed","Ahmed"));
        employeeName.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);






    }

}
