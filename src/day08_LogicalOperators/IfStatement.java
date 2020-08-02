package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {

        int a = 2000;
        int b = 2000;


        if( a > b ) {
            System.out.println(a+ " is the maximum number");

        }

        if ( b > a) {
            System.out.println(b+ " is the maximum number");

        }

        if ( a == b ) {
            System.out.println("Both are equal");
        }


        System.out.println("========================================");
        boolean breakTime = true;

        if (breakTime == true) {
            System.out.println("Take 15 min break");

        }

        if(breakTime == false) {
            System.out.println("Keep Studying");


        }

        System.out.println("========================================");

        boolean Corona = true;
        if (Corona == true) {
            System.out.println("Buy more toilet pappers");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Social Distance");
            System.out.println("Stay at home");
        }





    }


}
