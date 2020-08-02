package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        // Aaron Daniel is eligible to vote: true

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age =29;
        String citizenShip = "USA";


        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                       19 >= 18 && "China" == "USA"
        //                         true   &&   true
        //                             true
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);

        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);










    }



}
