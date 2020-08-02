package Office_Hours.Practice_07_06_2020;

public class Quiz {
    public static void main(String[] args) {
        String str = " ";
        str.trim(); // ""

        System.out.println(str.isEmpty());

        System.out.println("=========================");

        String ta = "A";
        ta = ta.concat("B"); // AB
        String tb = "C";
        ta = ta + tb; // ABC
        ta.replace("C","D");//ABD. but we didn't assign
        ta = ta + tb;//ABCC

        System.out.println("===========================");

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: "+ s1 == s2);
        //                 "s1 == s2 is: abc == "abc"
        //                  false






    }

}
