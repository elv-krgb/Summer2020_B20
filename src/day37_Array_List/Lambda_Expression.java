package day37_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,5,6,7,8,9));

        Predicate<Integer> lessThan5 = p -> p < 5; // p represents Integer
        list.removeIf(lessThan5);
        System.out.println(list); // [5, 6, 7, 8, 9]

        // shorter way
        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("==============================================");

        Predicate<Integer> oddNumbers = p -> p % 2 !=0;
       ArrayList<Integer> numbers = new ArrayList<>();
       for (int i=0; i<=100; i++){
           numbers.add(i);
       }
       numbers.removeIf(oddNumbers); // remove if the number is odd
       numbers.removeIf(p -> p % 2 == 0); // removes if number is even
        System.out.println(numbers);

        System.out.println("===============================================");

        //removes names start with M
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"));

        names.removeIf( eachElement -> eachElement.startsWith("M") && eachElement.endsWith("y") );
        System.out.println(names);





    }

}
