package day08_LogicalOperators;

import com.sun.javaws.IconUtil;

public class Practice2 {

    public static void main(String[] args) {
        String firstName = "Connor";
        String lastName = "McGregor";
        int age = 45;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
                             // 12 >= 18 ==> false
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                          // "USA" == "USA"  ||  "France" == "USA"
                          //     true        ||    false
                          //             true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                         false     &&   true ==> false
        //                                  false

        String fullName = firstName + " " + lastName;

        System.out.println(fullName + " is eligible to vote for President: " +eligibleToVote);






    }



}
