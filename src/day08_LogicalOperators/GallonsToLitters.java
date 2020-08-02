package day08_LogicalOperators;

public class GallonsToLitters {
    /*
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

     */

    public static void main(String[] args) {

        double gallons = 15;
        double litters = gallons * 3.785;

        System.out.println(gallons + " gallons equal to "+litters + " litters");

        /*
        2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

         */

        double litters1 = 20;
        double gallons1 = litters1/3.785;
        System.out.println(litters1 + " litters equal to " + gallons1 + " gallons");




    }


}
