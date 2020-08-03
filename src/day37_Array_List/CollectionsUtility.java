package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,100,0,-1,-3,400,500,5000));

        //maximum number  // Collections.max();
        Integer max = Collections.max(list);

        // minimum number // Collections.min();
        Integer min = Collections.min(list);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        System.out.println("===============================================");

        //replaceAll
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Roman", "Liliia", "Roman","Zeliha", "Aslan"));
        Collections.replaceAll(names, "Roman", "Fatima");
        System.out.println(names);




    }

}
